package br.ufscar.dc.compiladores.t5.ger;

import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdEscrevaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdLeiaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.IdentificadorContext;
import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoT5;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Visitor que gera o código C a partir da árvore T5,
 * usando as informações da tabela de símbolos
 * construída pela fase semântica.
 */
public class T5GeradorC extends T5BaseVisitor<Void> {

    private final Escopos pilhaDeTabelas;
    private final TabelaDeSimbolos tabela;
    private final StringBuilder saida = new StringBuilder();

    public T5GeradorC(TabelaDeSimbolos tabelaGlobal) {
        this.tabela = tabelaGlobal;
        // monta a pilha de escopos já com todos os símbolos declarados
        this.pilhaDeTabelas = new Escopos(tabelaGlobal);
    }

    /*
     * @Override
     * public Void visitPrograma(T5Parser.ProgramaContext ctx) {
     * saida.append("#include <stdio.h>\n");
     * saida.append("#include <stdlib.h>\n");
     * ctx.declaracoes().forEach(dec -> visitDeclaracoes(dec));
     * saida.append("\nint main() {\n");
     * for (T5Parser.CmdContext c : ctx.corpo().cmd()) {
     * visitCmd(c);
     * }
     * saida.append("  return 0;\n}\n");
     * return null;
     * }
     */

    @Override
    public Void visitPrograma(T5Parser.ProgramaContext ctx) {
        // 1) includes
        saida.append("#include <stdio.h>\n")
                .append("#include <stdlib.h>\n\n");
        // 2) declarações globais (se houver)
        ctx.declaracoes().forEach(dec -> visitDeclaracoes(dec));
        // 3) abre main
        saida.append("\nint main() {\n");
        // 4) corpo (variáveis + comandos)
        visitCorpo(ctx.corpo());
        // 5) fechamento
        saida.append("  return 0;\n")
                .append("}\n");
        return null;
    }

    @Override
    public Void visitCorpo(T5Parser.CorpoContext ctx) {
        // 0) abre escopo local no gerador
        pilhaDeTabelas.criarNovoEscopo();

        // 1) declarações locais: registra no escopo E gera C
        for (T5Parser.Declaracao_localContext loc : ctx.declaracao_local()) {
            // extrai o nome e o tipo
            if (loc.var1 != null) {
                String nome = loc.var1.identificador(0).getText();
                String txtTipo = loc.var1.tipo().getText().toLowerCase();
                TipoT5 tipo = txtTipo.equals("real") ? TipoT5.REAL
                        : txtTipo.equals("literal") ? TipoT5.LITERAL
                                : TipoT5.INTEIRO;
                pilhaDeTabelas.obterEscopoAtual().adicionar(nome, tipo);
            }
            visitDeclaracao_local(loc);
        }

        // 2) comandos
        for (T5Parser.CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }

        // 3) fecha escopo local
        pilhaDeTabelas.abandonarEscopo();
        return null;
    }

    @Override
    public Void visitDeclaracoes(T5Parser.DeclaracoesContext ctx) {
        // Declaração local (variável, constante ou tipo)
        if (ctx.declaracao_local() != null) {
            T5Parser.Declaracao_localContext d = ctx.declaracao_local();

            // Caso CONSTANTE: var2 != null
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
                // gera: <tipo> <nome> = <valor>;
                saida.append(cTipo)
                        .append(" ")
                        .append(nome)
                        .append(" = ")
                        .append(d.valor_constante().getText())
                        .append(";\n");

                // Caso VARIÁVEL (declare): var1 != null
            } else if (d.var1 != null) {
                String strTipo = d.var1.tipo().getText().toLowerCase();
                if (strTipo.equals("literal")) {
                    // gera char x[80];
                    for (IdentificadorContext idCtx : d.var1.identificador()) {
                        String nome = idCtx.getText();
                        saida.append("char ").append(nome).append("[80];\n");
                    }
                } else {
                    // seu código existente:
                    String cTipo = strTipo.equals("real") ? "float" : "int";
                    for (IdentificadorContext idCtx : d.var1.identificador()) {
                        String nome = idCtx.getText();
                        saida.append(cTipo).append(" ").append(nome).append(";\n");
                    }
                }

            } else {
                // ex. d.var3 é o IDENT do tipo, d.tipo é a regra de registro
                // …
            }

            // Declaração global (procedimento/função)
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

            // 1) Encontra o tipo da variável na pilha de escopos
            TipoT5 tipoVariavel = TipoT5.INVALIDO;
            for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (esc.existe(nome)) {
                    tipoVariavel = esc.verificar(nome);
                    break;
                }
            }

            // 2) Gera o código de leitura adequado
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
            // 1) determina tipo
            TipoT5 tipo = (i < exprA.size())
                    ? T5SemanticoUtils.verificarTipo(pilhaDeTabelas, exprA.get(i))
                    : T5SemanticoUtils.verificarTipo(pilhaDeTabelas, exprL.get(i));
            // 2) pega o texto que vai no printf
            String arg = (i < exprA.size())
                    ? exprA.get(i).getText()
                    : exprL.get(i).getText();
            // 3) gera o printf adequado
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

    // … demais visitadores de expressões aritméticas, fator, parcela, relacional …
    // (copie exatamente o que você já havia implementado antes) …

    /**
     * Recupera todo o código C gerado até aqui.
     */
    public String getSaida() {
        return saida.toString();
    }
}
