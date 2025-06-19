package br.ufscar.dc.compiladores.t5.ger;

import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdEscrevaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdLeiaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.IdentificadorContext;
import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoT5;


public class T5GeradorC extends T5BaseVisitor<Void> {

    private final Escopos pilhaDeTabelas;
    private final TabelaDeSimbolos tabela;
    private final StringBuilder saida = new StringBuilder();

    public T5GeradorC(TabelaDeSimbolos tabelaGlobal) {
        this.tabela = tabelaGlobal;
        // monta a pilha de escopos já com todos os símbolos declarados
        this.pilhaDeTabelas = new Escopos(tabelaGlobal);
    }

    @Override
    public Void visitPrograma(T5Parser.ProgramaContext ctx) {
        saida.append("#include <stdio.h>\n")
                .append("#include <stdlib.h>\n");
        ctx.declaracoes().forEach(dec -> visitDeclaracoes(dec));
        saida.append("\nint main() {\n");
        visitCorpo(ctx.corpo());
        saida.append("  return 0;\n")
                .append("}\n");
        return null;
    }

    @Override
    public Void visitCorpo(T5Parser.CorpoContext ctx) {
        pilhaDeTabelas.criarNovoEscopo();

        for (T5Parser.Declaracao_localContext loc : ctx.declaracao_local()) {
            if (loc.var1 != null) {
                String txtTipo = loc.var1.tipo().getText().toLowerCase();
                for (T5Parser.IdentificadorContext idCtx : loc.var1.identificador()) {
                    String nome = idCtx.getText();
                    TipoT5 tipo = txtTipo.equals("literal") ? TipoT5.LITERAL
                                  : txtTipo.equals("real")    ? TipoT5.REAL
                                                              : TipoT5.INTEIRO;
                    pilhaDeTabelas.obterEscopoAtual().adicionar(nome, tipo);

                    // gera a declaração em C
                    if (tipo == TipoT5.LITERAL) {
                        saida.append("  char ").append(nome).append("[80];\n");
                    } else {
                        String cTipo = (tipo == TipoT5.REAL ? "float" : "int");
                        saida.append("  ").append(cTipo)
                             .append(" ").append(nome).append(";\n");
                    }
                }
            }
        }

        for (T5Parser.CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        pilhaDeTabelas.abandonarEscopo();
        return null;
    }



    @Override
    public Void visitDeclaracoes(T5Parser.DeclaracoesContext ctx) {
        if (ctx.declaracao_local() != null) {
            T5Parser.Declaracao_localContext d = ctx.declaracao_local();

            if (d.var2 != null) {
                String nome = d.var2.getText();
                String strTipo = d.tipo_basico().getText().toLowerCase();
                String cTipo;
                switch (strTipo) {
                    case "inteiro":
                        cTipo = "int";
                        break;
                    case "real":
                        cTipo = "float";
                        break;
                    default:
                        cTipo = "int";
                }
                saida.append(cTipo)
                        .append(" ")
                        .append(nome)
                        .append(" = ")
                        .append(d.valor_constante().getText())
                        .append(";\n");

            } else if (d.var1 != null) {
                String strTipo = d.var1.tipo().getText().toLowerCase();
                if (strTipo.equals("literal")) {
                    // gera char x[80];
                    for (IdentificadorContext idCtx : d.var1.identificador()) {
                        String nome = idCtx.getText();
                        saida.append("char ").append(nome).append("[80];\n");
                    }
                } else {
                    String cTipo = strTipo.equals("real") ? "float" : "int";
                    for (IdentificadorContext idCtx : d.var1.identificador()) {
                        String nome = idCtx.getText();
                        saida.append(cTipo).append(" ").append(nome).append(";\n");
                    }
                }
            } else {
                // fz p registro e ponteiros...
            }
        } else if (ctx.declaracao_global() != null) {
            visitDeclaracao_global(ctx.declaracao_global());
        }

        return null;
    }

    @Override
    public Void visitCmd(T5Parser.CmdContext ctx) {
        if (ctx.cmdAtribuicao() != null) {
            visitCmdAtribuicao(ctx.cmdAtribuicao());
        } else if (ctx.cmdLeia() != null) {
            visitCmdLeia(ctx.cmdLeia());
        } else if (ctx.cmdEscreva() != null) {
            visitCmdEscreva(ctx.cmdEscreva());
        } else if (ctx.cmdSe() != null) {
            visitCmdSe(ctx.cmdSe());
        } else if (ctx.cmdEnquanto() != null) {
            visitCmdEnquanto(ctx.cmdEnquanto());
        }
        return null;
    }

    @Override
    public Void visitCmdLeia(CmdLeiaContext ctx) {
        for (IdentificadorContext idCtx : ctx.identificador()) {
            String nome = idCtx.getText();

            TipoT5 tipoVariavel = TipoT5.INVALIDO;
            for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (esc.existe(nome)) {
                    tipoVariavel = esc.verificar(nome);
                    break;
                }
            }
            if (tipoVariavel == TipoT5.LITERAL) {
                saida.append("gets(").append(nome).append(");\n");
            } else {
                String fmt = (tipoVariavel == TipoT5.REAL ? "%f" : "%d");
                saida.append("scanf(\"").append(fmt).append("\", &").append(nome).append(");\n");
            }
        }
        return null;
    }

    @Override
    public Void visitCmdEscreva(CmdEscrevaContext ctx) {
        var exprA = ctx.expressaoAritmetica();
        var exprL = ctx.expressao();
        int total = Math.max(exprA.size(), exprL.size());
        for (int i = 0; i < total; i++) {
            TipoT5 tipo = (i < exprA.size())
                    ? T5SemanticoUtils.verificarTipo(pilhaDeTabelas, exprA.get(i))
                    : T5SemanticoUtils.verificarTipo(pilhaDeTabelas, exprL.get(i));
            String arg = (i < exprA.size())
                    ? exprA.get(i).getText()
                    : exprL.get(i).getText();
            if (tipo == TipoT5.LITERAL) {
                saida.append("printf(\"%s\", ").append(arg).append(");\n");
            } else {
                String fmt = (tipo == TipoT5.REAL ? "%f" : "%d");
                saida.append("printf(\"").append(fmt)
                        .append("\\n\", ").append(arg).append(");\n");
            }
        }
        return null;
    }

    @Override
    public Void visitCmdAtribuicao(T5Parser.CmdAtribuicaoContext ctx) {
        String nomeVar = ctx.identificador().getText();
        saida.append(nomeVar).append(" = ");
        visitExpressao(ctx.expressao());
        saida.append(";\n");
        return null;
    }

    @Override
    public Void visitCmdSe(T5Parser.CmdSeContext ctx) {
        saida.append("if(");
        visitExpressao(ctx.expressao());
        saida.append(") ");
        visitCmd(ctx.cmd(0));
        if (ctx.cmd().size() > 1) {
            saida.append("else ");
            visitCmd(ctx.cmd(1));
        }
        return null;
    }

    @Override
    public Void visitCmdEnquanto(T5Parser.CmdEnquantoContext ctx) {
        saida.append("while(");
        visitExpressao(ctx.expressao());
        saida.append(") {\n");
        for (T5Parser.CmdContext c : ctx.cmd()) {
            visitCmd(c);
        }
        saida.append("}\n");
        return null;
    }

    public String getSaida() {
        return saida.toString();
    }
}
