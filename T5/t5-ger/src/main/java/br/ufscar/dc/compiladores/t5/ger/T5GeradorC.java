package br.ufscar.dc.compiladores.t5.ger;

import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoT5;

import java.util.List;
import java.io.IOException;

public class T5GeradorC extends T5BaseVisitor<Void> {

    StringBuilder saida;
    TabelaDeSimbolos tabela;

    public T5GeradorC() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
    }

    @Override
    public Void visitPrograma(T5Parser.ProgramaContext ctx) {
        saida.append("#include <stdio.h>\n");
        saida.append("#include <stdlib.h>\n");
        saida.append("\n");
        ctx.declaracoes().forEach(dec -> visitDeclaracoes(dec));
        saida.append("\n");
        saida.append("int main() {\n");
        for (T5Parser.CmdContext c : ctx.corpo().cmd()) {
            visitCmd(c);
        }
        saida.append("}\n");

        return null;
    }

    @Override
    public Void visitDeclaracoes(T5Parser.DeclaracoesContext ctx) {
        // Se for uma declaração local (variável, constante ou tipo)
        if (ctx.declaracao_local() != null) {
            T5Parser.Declaracao_localContext d = ctx.declaracao_local();

            // Caso seja uma CONSTANTE (var2 != null)
            if (d.var2 != null) {
                String nomeVar = d.var2.getText();
                String strTipoVar = d.tipo_basico().getText().toLowerCase();
                TabelaDeSimbolos.TipoT5 tipoVar = TabelaDeSimbolos.TipoT5.INVALIDO;

                // Mapeia o tipo do T5 para o tipo C
                switch (strTipoVar) {
                    case "inteiro":
                        tipoVar = TabelaDeSimbolos.TipoT5.INTEIRO;
                        strTipoVar = "int";
                        break;
                    case "real":
                        tipoVar = TabelaDeSimbolos.TipoT5.REAL;
                        strTipoVar = "float";
                        break;
                    default:
                        // nunca chega aqui, pois a gramática só permite literal, inteiro, real, lógico
                        // ou registro
                        break;
                }

                // Adiciona na tabela e gera a declaração em C
                tabela.adicionar(nomeVar, tipoVar);
                saida.append(strTipoVar)
                        .append(" ")
                        .append(nomeVar)
                        .append(" = ")
                        .append(d.valor_constante().getText())
                        .append(";\n");

                // Caso seja uma VARIÁVEL (declaração com 'declare')
            } else if (d.var1 != null) {
                // d.var1 é o contexto da regra variavel
                List<T5Parser.IdentificadorContext> ids = d.var1.identificador();
                String strTipoVar = d.var1.tipo().getText().toLowerCase();
                String cTipo = strTipoVar.equals("real") ? "float" : "int";
                TabelaDeSimbolos.TipoT5 tipoVar = strTipoVar.equals("real") ? TabelaDeSimbolos.TipoT5.REAL
                        : TabelaDeSimbolos.TipoT5.INTEIRO;

                // Para cada identificador declarado, gera e adiciona na tabela
                for (T5Parser.IdentificadorContext idCtx : ids) {
                    String nomeVar = idCtx.getText();
                    tabela.adicionar(nomeVar, tipoVar);
                    saida.append(cTipo)
                            .append(" ")
                            .append(nomeVar)
                            .append(";\n");
                }
            }
            // (caso “tipo” — definição de record — você pode gerar struct aqui)

            // Se for uma declaração global (procedimento ou função)
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
    public Void visitCmdAtribuicao(T5Parser.CmdAtribuicaoContext ctx) {
        saida.append(ctx.VARIAVEL().getText() + " = ");
        visitExpressaoAritmetica(ctx.expressaoAritmetica());
        saida.append(";\n");
        return null;
    }

    @Override
    public Void visitCmdSe(T5Parser.CmdSeContext ctx) {
        saida.append("if(");
        visitExpressaoRelacional(ctx.expressaoRelacional());
        saida.append(")\n");
        visitCmd(ctx.cmd(0));
        if (ctx.cmd().size() > 1) { // tem else
            saida.append("else\n");
            visitCmd(ctx.cmd(1));
        }
        return null;
    }

    @Override
    public Void visitCmdLeia(T5Parser.CmdLeiaContext ctx) {
        String nomeVar = ctx.VARIAVEL().getText();
        TipoT5 tipoVariavel = T5SemanticoUtils.verificarTipo(tabela, nomeVar);
        String aux = "";
        switch (tipoVariavel) {
            case INTEIRO:
                aux = "%d";
                break;
            case REAL:
                aux = "%f";
                break;
        }
        saida.append("scanf(\"" + aux + "\", &" + nomeVar + ");\n");
        return null;
    }

    @Override
    public Void visitCmdEnquanto(T5Parser.CmdEnquantoContext ctx) {
        saida.append("while(");
        visitExpressaoRelacional(ctx.expressaoRelacional());
        saida.append(")\n");
        visitCmd(ctx.cmd());
        return null;
    }

    @Override
    public Void visitCmdEscreva(T5Parser.CmdEscrevaContext ctx) {
        if (ctx.pn2() != null) {
            String aux = ctx.pn2().getText();
            aux = aux.substring(1, aux.length() - 1);
            saida.append("printf(\"" + aux + "\\n\");\n");
        } else {
            TipoT5 tipoExpressao = T5SemanticoUtils.verificarTipo(tabela, ctx.expressaoAritmetica());
            String aux = "";
            switch (tipoExpressao) {
                case INTEIRO:
                    aux = "%d";
                    break;
                case REAL:
                    aux = "%f";
                    break;
            }
            saida.append("printf(\"" + aux + "\\n\",");
            visitExpressaoAritmetica(ctx.expressaoAritmetica());
            saida.append(");\n");
        }
        return null;
    }

    @Override
    public Void visitExpressaoAritmetica(T5Parser.ExpressaoAritmeticaContext ctx) {
        visitTermoAritmetico(ctx.termoAritmetico(0));
        for (int i = 0; i < ctx.op1().size(); i++) {
            saida.append(" " + ctx.op1(i).getText() + " ");
            visitTermoAritmetico(ctx.termoAritmetico(i + 1));
        }
        return null;
    }

    @Override
    public Void visitTermoAritmetico(T5Parser.TermoAritmeticoContext ctx) {
        visitFatorAritmetico(ctx.fatorAritmetico(0));
        for (int i = 0; i < ctx.op2().size(); i++) {
            saida.append(" " + ctx.op2(i).getText() + " ");
            visitFatorAritmetico(ctx.fatorAritmetico(i + 1));
        }
        return null;
    }

    @Override
    public Void visitFatorAritmetico(T5Parser.FatorAritmeticoContext ctx) {
        // primeira parcela
        visitParcela_unario(ctx.parcelas.get(0));

        // repete para cada '%'
        for (int i = 0; i < ctx.op3.size(); i++) {
            saida.append(" ").append(ctx.op3.get(i).getText()).append(" ");
            visitParcela_unario(ctx.parcelas.get(i + 1));
        }
        return null;
    }

    @Override
    public Void visitParcela_unario(T5Parser.Parcela_unarioContext ctx) {
        if (ctx.p3 != null) {
            saida.append(ctx.p3.getText()); // NUM_INT
        } else if (ctx.p4 != null) {
            saida.append(ctx.p4.getText()); // NUM_REAL
        } else if (ctx.p1 != null) {
            saida.append(ctx.p1.getText()); // identificador
        } else if (ctx.p2 != null) {
            // ctx.p2 é o IDENT da chamada; ctx.expressao() lista os parâmetros
            saida.append(ctx.p2.getText()).append("(");
            for (int i = 0; i < ctx.expressao().size(); i++) {
                if (i > 0)
                    saida.append(", ");
                visitExpressao(ctx.expressao(i));
            }
            saida.append(")");
        } else {
            // parênteses: ctx.p5 é a sub-expressão
            saida.append("(");
            visitExpressao(ctx.p5);
            saida.append(")");
        }
        return null;
    }

    @Override
    public Void visitExpressaoRelacional(T5Parser.ExpressaoRelacionalContext ctx) {
        visitTermoRelacional(ctx.termoRelacional(0));
        for (int i = 0; i < ctx.op_logico().size(); i++) {
            String aux = null;
            if (ctx.op_logico(i).getText().equals("E")) {
                aux = "&&";
            } else {
                aux = "||";
            }
            saida.append(" " + aux + " ");
            visitTermoRelacional(ctx.termoRelacional(i + 1));
        }
        return null;
    }

    @Override
    public Void visitTermoRelacional(T5Parser.TermoRelacionalContext ctx) {
        if (ctx.expressaoRelacional() != null) {
            saida.append("(");
            visitExpressaoRelacional(ctx.expressaoRelacional());
            saida.append(")");
        } else {
            visitExpressaoAritmetica(ctx.expressaoAritmetica(0));
            String aux = ctx.op_relacional().getText();
            if (aux.equals("<>")) {
                aux = "!=";
            } else if (aux.equals("=")) {
                aux = "==";
            }
            saida.append(" " + aux + " ");
            visitExpressaoAritmetica(ctx.expressaoAritmetica(1));
        }
        return null;
    }
}