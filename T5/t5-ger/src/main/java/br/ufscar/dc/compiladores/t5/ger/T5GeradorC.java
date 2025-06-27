package br.ufscar.dc.compiladores.t5.ger;

import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdAtribuicaoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdCasoContext;
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
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Item_selecaoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Numero_intervaloContext;
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
                        : base.equals("real") ? TipoT5.REAL
                                : TipoT5.INTEIRO;
                for (IdentificadorContext idCtx : var.identificador()) {
                    String nome = idCtx.getText();
                    pilhaDeTabelas.obterEscopoAtual().adicionar(nome, tipo);
                    // gera declaração em C
                    if (tipo == TipoT5.LITERAL) {
                        saida.append("  char ");
                        if (ehPonteiro)
                            saida.append("*");
                        saida.append(nome).append("[80];\n");
                    } else {
                        String cTipo = (tipo == TipoT5.REAL ? "float" : "int");
                        saida.append("  ").append(cTipo).append(" ");
                        if (ehPonteiro)
                            saida.append("*");
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
            var d = ctx.declaracao_local();
            // CONSTANTE (gera #define)
            if (d.var2 != null) {
                String nome = d.var2.getText();
                String valor = d.valor_constante().getText();
                // registra no escopo, se precisar semântica depois
                pilhaDeTabelas.obterEscopoAtual()
                        .adicionar(nome, TipoT5.INTEIRO);
                // gera macro
                saida.append("#define ")
                        .append(nome)
                        .append(" ")
                        .append(valor)
                        .append("\n");
            } else if (d.var1 != null) {
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
                        if (ehPonteiro)
                            saida.append("*");
                        saida.append(nome).append("[80];\n");
                    } else {
                        saida.append(cTipo).append(" ");
                        if (ehPonteiro)
                            saida.append("*");
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
    public Void visitCmd(T5Parser.CmdContext ctx) {
        if (ctx.cmdLeia() != null) {
            return visitCmdLeia(ctx.cmdLeia());
        } else if (ctx.cmdEscreva() != null) {
            return visitCmdEscreva(ctx.cmdEscreva());
        } else if (ctx.cmdAtribuicao() != null) {
            return visitCmdAtribuicao(ctx.cmdAtribuicao());
        } else if (ctx.cmdSe() != null) {
            return visitCmdSe(ctx.cmdSe());
        } else if (ctx.cmdEnquanto() != null) {
            return visitCmdEnquanto(ctx.cmdEnquanto());
        } else if (ctx.cmdCaso() != null) {
            return visitCmdCaso(ctx.cmdCaso());
        }
        // chute para cmdPara, cmdPara, cmdFaca, cmdChamada, cmdRetorne…
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

    @Override
    public Void visitCmdCaso(CmdCasoContext ctx) {
        // abre o switch
        String expr = ctx.exp_aritmetica().getText();
        saida.append("switch(")
                .append(expr)
                .append(") {\n");

        // cada item (cada conjunto de constantes)
        for (Item_selecaoContext item : ctx.selecao().item_selecao()) {
            // para cada intervalo ou valor único
            for (Numero_intervaloContext ni : item.constantes().numero_intervalo()) {
                String txt = ni.getText();
                if (txt.contains("..")) {
                    String[] p = txt.split("\\.\\.");
                    int ini = Integer.parseInt(p[0]);
                    int fim = Integer.parseInt(p[1]);
                    for (int v = ini; v <= fim; v++) {
                        saida.append("    case ").append(v).append(":\n");
                    }
                } else {
                    saida.append("    case ").append(txt).append(":\n");
                }
            }
            // comandos do case
            for (CmdContext cmd : item.cmd()) {
                // identa um nível extra para ficar bonitinho
                saida.append("        ");
                visitCmd(cmd);
            }
            saida.append("        break;\n");
        }

        // bloco senao vira default
        if (ctx.SENAO() != null) {
            saida.append("    default:\n");
            for (CmdContext cmd : ctx.cmd()) {
                saida.append("        ");
                visitCmd(cmd);
            }
            saida.append("        break;\n");
        }

        saida.append("}\n");
        return null;
    }

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
