package br.ufscar.dc.compiladores.t5.ger;

import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdAtribuicaoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdEnquantoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdEscrevaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdLeiaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdSeContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CorpoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Declaracao_localContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.DeclaracoesContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.ExpressaoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.IdentificadorContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.ProgramaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.VariavelContext;
import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoT5;

public class T5GeradorC extends T5BaseVisitor<Void> {

    private final Escopos pilhaDeTabelas;
    private final TabelaDeSimbolos tabela;
    private final StringBuilder saida = new StringBuilder();

    public T5GeradorC(Escopos sem) {
        this.pilhaDeTabelas = sem;
        this.tabela = sem.obterEscopoAtual();
    }

    @Override
    public Void visitPrograma(ProgramaContext ctx) {
        saida.append("#include <stdio.h>\n")
             .append("#include <stdlib.h>\n\n");
        for (DeclaracoesContext dec : ctx.declaracoes()) {
            visitDeclaracoes(dec);
        }
        saida.append("\nint main() {\n");
        visitCorpo(ctx.corpo());
        saida.append("  return 0;\n")
             .append("}\n");
        return null;
    }

    @Override
    public Void visitCorpo(CorpoContext ctx) {
        pilhaDeTabelas.criarNovoEscopo();
        // Declarações locais (var1)
        for (Declaracao_localContext loc : ctx.declaracao_local()) {
            if (loc.var1 != null) {
                VariavelContext var = loc.var1;
                boolean ehPonteiro = var.tipo().tipo_estendido().PONTEIRO() != null;
                // pega o texto do tipo básico ou IDENT
                String base = var.tipo().tipo_estendido().tipo_basico_ident().getText().toLowerCase();
                TipoT5 tipo = base.equals("literal") ? TipoT5.LITERAL
                           : base.equals("real")    ? TipoT5.REAL
                                                     : TipoT5.INTEIRO;
                for (IdentificadorContext idCtx : var.identificador()) {
                    String nome = idCtx.getText();
                    pilhaDeTabelas.obterEscopoAtual().adicionar(nome, tipo);
                    // gera declaração em C
                    if (tipo == TipoT5.LITERAL) {
                        saida.append("  char ");
                        if (ehPonteiro) saida.append("*");
                        saida.append(nome).append("[80];\n");
                    } else {
                        String cTipo = (tipo == TipoT5.REAL ? "float" : "int");
                        saida.append("  ").append(cTipo).append(" ");
                        if (ehPonteiro) saida.append("*");
                        saida.append(nome).append(";\n");
                    }
                }
            }
        }
        // comandos
        for (CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        pilhaDeTabelas.abandonarEscopo();
        return null;
    }

    @Override
    public Void visitDeclaracoes(DeclaracoesContext ctx) {
        if (ctx.declaracao_local() != null) {
            Declaracao_localContext d = ctx.declaracao_local();
            // constante local
            if (d.var2 != null) {
                String nome = d.var2.getText();
                String txtTipo = d.tipo_basico().getText().toLowerCase();
                String cTipo = txtTipo.equals("real") ? "float" : "int";
                saida.append(cTipo)
                     .append(" ")
                     .append(nome)
                     .append(" = ")
                     .append(d.valor_constante().getText())
                     .append(";\n");
            }
            // var global
            else if (d.var1 != null) {
                VariavelContext var = d.var1;
                boolean ehPonteiro = var.tipo().tipo_estendido().PONTEIRO() != null;
                String base = var.tipo().tipo_estendido().tipo_basico_ident().getText().toLowerCase();
                String cTipo = base.equals("real") ? "float"
                               : base.equals("literal") ? "char"
                               : "int";
                for (IdentificadorContext idCtx : var.identificador()) {
                    String nome = idCtx.getText();
                    if (base.equals("literal")) {
                        saida.append("char ");
                        if (ehPonteiro) saida.append("*");
                        saida.append(nome).append("[80];\n");
                    } else {
                        saida.append(cTipo).append(" ");
                        if (ehPonteiro) saida.append("*");
                        saida.append(nome).append(";\n");
                    }
                }
            }
            // tipos e registros podem ser gerados aqui, se desejado...
        } else if (ctx.declaracao_global() != null) {
            // você pode gerar protótipos de função/procedimento aqui, se precisar
            visitDeclaracao_global(ctx.declaracao_global());
        }
        return null;
    }

    @Override
    public Void visitCmdLeia(CmdLeiaContext ctx) {
        for (IdentificadorContext idCtx : ctx.identificador()) {
            String nome = idCtx.getText();
            var info = T5SemanticoUtils.verificarIdentificador(pilhaDeTabelas, idCtx);
            if (info.tipo == TipoT5.LITERAL) {
                saida.append("gets(").append(nome).append(");\n");
            } else {
                String fmt = (info.tipo == TipoT5.REAL ? "%f" : "%d");
                // se for ponteiro, já é endereço; senão usa &nome
                String alvo = info.ehPonteiro ? nome : "&" + nome;
                saida.append("scanf(\"").append(fmt).append("\", ").append(alvo).append(");\n");
            }
        }
        return null;
    }

    @Override
    public Void visitCmdEscreva(CmdEscrevaContext ctx) {
        for (ExpressaoContext eCtx : ctx.expressao()) {
            // cada expressao pode gerar texto ou número
            TipoT5 tipo = T5SemanticoUtils.verificarTipo(pilhaDeTabelas, eCtx);
            String txt = eCtx.getText();
            if (tipo == TipoT5.LITERAL) {
                saida.append("printf(\"%s\",").append(txt).append(");");
            } else {
                String fmt = (tipo == TipoT5.REAL ? "%.6f" : "%d");
                saida.append("printf(\"").append(fmt)
                     .append("\",").append(txt).append(");\n");
            }
            saida.append("fflush(stdout);\n");
        }
        return null;
    }

    @Override
    public Void visitCmdAtribuicao(CmdAtribuicaoContext ctx) {
        boolean lhsDeref = ctx.PONTEIRO() != null;
        String nome = ctx.identificador().getText();
        if (lhsDeref) {
            saida.append("*").append(nome).append(" = ");
        } else {
            saida.append(nome).append(" = ");
        }
        // reutiliza o visitor para imprimir a expressão
        visitExpressao(ctx.expressao());
        saida.append(";\n");
        return null;
    }

    @Override
    public Void visitCmdSe(CmdSeContext ctx) {
        saida.append("if(");
        visitExpressao(ctx.expressao());
        saida.append(") ");
        visitCmd(ctx.cmd(0));
        if (ctx.SENAO() != null && !ctx.cmd(1).isEmpty()) {
            saida.append("else ");
            visitCmd(ctx.cmd(1));
        }
        return null;
    }

    @Override
    public Void visitCmdEnquanto(CmdEnquantoContext ctx) {
        saida.append("while(");
        visitExpressao(ctx.expressao());
        saida.append(") {\n");
        for (CmdContext c : ctx.cmd()) {
            visitCmd(c);
        }
        saida.append("}\n");
        return null;
    }

    // mantenha os outros visitCmd… (cmdPara, cmdFaca, cmdCaso) se precisar

    @Override
    public Void visitExpressao(ExpressaoContext ctx) {
        // imprime literalmente: por simplicidade, usamos getText()
        saida.append(ctx.getText());
        return null;
    }

    public String getSaida() {
        return saida.toString();
    }
}
