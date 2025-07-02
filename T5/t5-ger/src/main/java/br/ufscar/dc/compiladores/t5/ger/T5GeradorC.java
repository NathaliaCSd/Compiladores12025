package br.ufscar.dc.compiladores.t5.ger;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;

import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdAtribuicaoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdCasoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdEnquantoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdEscrevaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdLeiaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdParaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdRetorneContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdSeContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.CorpoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Declaracao_localContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.DeclaracoesContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Exp_relacionalContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.ExpressaoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Fator_logicoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.IdentificadorContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Item_selecaoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Numero_intervaloContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.ParametroContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.ParametrosContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Parcela_logicaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.ProgramaContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.RegistroContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Termo_logicoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.TipoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.Tipo_estendidoContext;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.VariavelContext;
import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoEntrada;
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
                .append("#include <stdlib.h>\n\n")
                .append("#include <string.h>\n\n");
        for (DeclaracoesContext dec : ctx.declaracoes()) {
            visitDeclaracoes(dec);
        }
        saida.append("\nint main() {\n");
        visitCorpo(ctx.corpo());
        saida.append("   return 0;\n")
                .append("}\n");
        return null;
    }

    @Override
    public Void visitCorpo(CorpoContext ctx) {
        pilhaDeTabelas.criarNovoEscopo();

        for (Declaracao_localContext loc : ctx.declaracao_local()) {
            // ── 0) tipos/registro declarados dentro do corpo ─────
            if (loc.var3 != null) {
                String nomeTipo = loc.var3.getText();
                // monta a tabela de campos do registro
                TabelaDeSimbolos registroTable = new TabelaDeSimbolos();
                saida.append("    typedef struct {\n");
                for (VariavelContext campo : loc.tipo().registro().variavel()) {
                    Tipo_estendidoContext te = campo.tipo().tipo_estendido();
                    String base = te.tipo_basico_ident().getText().toLowerCase();
                    String cTipo = base.equals("real") ? "float"
                            : base.equals("literal") ? "char"
                                    : "int";
                    boolean ptr = te.PONTEIRO() != null;
                    String dim = base.equals("literal") ? "[80]" : "";
                    for (IdentificadorContext idCampo : campo.identificador()) {
                        // registra campo na tabela interna
                        registroTable.adicionar(
                                idCampo.getText(),
                                TipoEntrada.VARIAVEL,
                                base.equals("literal") ? TipoT5.LITERAL
                                        : base.equals("real") ? TipoT5.REAL
                                                : TipoT5.INTEIRO,
                                ptr,
                                null,
                                false,
                                false);
                        // escreve a linha do struct
                        saida.append("        ")
                                .append(cTipo).append(ptr ? "*" : "")
                                .append(" ").append(idCampo.getText())
                                .append(dim).append(";\n");
                    }
                }
                saida.append("    } ").append(nomeTipo).append(";\n\n");
                // registra o novo tipo no escopo atual
                pilhaDeTabelas.obterEscopoAtual().adicionar(
                        nomeTipo,
                        TipoEntrada.TIPO,
                        TipoT5.REGISTRO,
                        false,
                        registroTable,
                        false,
                        false);
                continue;
            }

            // ── 1) variáveis (nomeado, inline ou básica) ────────
            if (loc.var1 == null)
                continue;
            VariavelContext var = loc.var1;
            TipoContext typeCtx = var.tipo();

            // 1.a) registro nomeado (já tipado acima)
            if (typeCtx.tipo_estendido() != null) {
                String nomeTipo = typeCtx.tipo_estendido()
                        .tipo_basico_ident()
                        .getText();
                var entradaTipo = pilhaDeTabelas.obterEntrada(nomeTipo);
                if (entradaTipo != null
                        && entradaTipo.getTipoEntrada() == TipoEntrada.TIPO
                        && entradaTipo.getTipo() == TipoT5.REGISTRO) {
                    for (IdentificadorContext idCtx : var.identificador()) {
                        String varName = idCtx.getText();
                        saida.append("    ")
                                .append(nomeTipo).append(" ")
                                .append(varName).append(";\n");
                        pilhaDeTabelas.obterEscopoAtual().adicionar(
                                varName,
                                TipoEntrada.VARIAVEL,
                                TipoT5.REGISTRO,
                                false,
                                entradaTipo.getRegistro(),
                                false,
                                false);
                    }
                    continue;
                }
            }
            // 1.b) registro inline
            if (typeCtx.registro() != null) {
                RegistroContext regCtx = typeCtx.registro();
                // monta tabela interna dos campos
                TabelaDeSimbolos registroTable = new TabelaDeSimbolos();
                for (VariavelContext campo : regCtx.variavel()) {
                    Tipo_estendidoContext teCampo = campo.tipo().tipo_estendido();
                    String base = teCampo.tipo_basico_ident().getText().toLowerCase();
                    TipoT5 tipoCampo = base.equals("literal") ? TipoT5.LITERAL
                            : base.equals("real") ? TipoT5.REAL
                                    : TipoT5.INTEIRO;
                    for (IdentificadorContext idCampo : campo.identificador()) {
                        registroTable.adicionar(
                                idCampo.getText(),
                                TipoEntrada.VARIAVEL,
                                tipoCampo,
                                teCampo.PONTEIRO() != null,
                                null,
                                false,
                                false);
                    }
                }
                // emite o “struct { … } varName;” e registra no escopo
                for (IdentificadorContext idVar : var.identificador()) {
                    String varName = idVar.getText();
                    saida.append("    struct {\n");
                    for (TabelaDeSimbolos.EntradaTabelaDeSimbolos campo : registroTable.entradas()) {
                        String cTipo = campo.getTipo() == TipoT5.REAL ? "float"
                                : campo.getTipo() == TipoT5.LITERAL ? "char"
                                        : "int";
                        boolean ptr = campo.isPonteiro();
                        String dim = (campo.getTipo() == TipoT5.LITERAL ? "[80]" : "");
                        saida.append("        ")
                                .append(cTipo).append(ptr ? "*" : "")
                                .append(" ").append(campo.nome)
                                .append(dim).append(";\n");
                    }
                    saida.append("    } ").append(varName).append(";\n");

                    pilhaDeTabelas.obterEscopoAtual().adicionar(
                            varName,
                            TipoEntrada.VARIAVEL,
                            TipoT5.REGISTRO,
                            false,
                            registroTable,
                            false,
                            false);
                }
                continue; // pula o bloco básico
            }

            // 1.c) tipos básicos / ponteiros
            Tipo_estendidoContext te = typeCtx.tipo_estendido();
            if (te == null)
                continue;
            boolean ehPonteiro = te.PONTEIRO() != null;
            String ba = te.tipo_basico_ident().getText().toLowerCase();
            TipoT5 tipoT5 = ba.equals("literal") ? TipoT5.LITERAL
                    : ba.equals("real") ? TipoT5.REAL
                            : TipoT5.INTEIRO;
            String cTipo = tipoT5 == TipoT5.LITERAL ? "char"
                    : tipoT5 == TipoT5.REAL ? "float"
                            : "int";

            for (IdentificadorContext idVar : var.identificador()) {
                String nomeVar = idVar.getText();
                // registra variável (com flag de ponteiro, se for o caso)
                pilhaDeTabelas.obterEscopoAtual().adicionar(
                        nomeVar,
                        TipoEntrada.VARIAVEL,
                        tipoT5,
                        ehPonteiro,
                        null,
                        false,
                        false);
                // emite a linha em C
                saida.append("    ")
                        .append(cTipo).append(ehPonteiro ? "*" : "")
                        .append(" ").append(nomeVar)
                        .append(tipoT5 == TipoT5.LITERAL ? "[80]" : "")
                        .append(";\n");
            }
        }

        // 2) comandos do corpo
        for (CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }

        // 3) fecha escopo
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
            else if (d.var3 != null) {
                String nomeTipo = d.var3.getText();
                // 1) monta a tabela interna dos campos
                TabelaDeSimbolos registroTable = new TabelaDeSimbolos();
                saida.append("typedef struct {\n");
                for (VariavelContext campo : d.tipo().registro().variavel()) {
                    // pega o tipo básico de cada campo
                    Tipo_estendidoContext te = campo.tipo().tipo_estendido();
                    String base = te.tipo_basico_ident().getText().toLowerCase();
                    String cTipo = base.equals("real") ? "float"
                            : base.equals("literal") ? "char"
                                    : "int";
                    boolean ptr = te.PONTEIRO() != null;
                    for (IdentificadorContext id : campo.identificador()) {
                        // cadastra o campo na tabela interna
                        registroTable.adicionar(
                                id.getText(),
                                TipoEntrada.VARIAVEL,
                                base.equals("literal") ? TipoT5.LITERAL
                                        : base.equals("real") ? TipoT5.REAL
                                                : TipoT5.INTEIRO,
                                ptr,
                                null, // sem sub-registro aninhado
                                false,
                                false);
                        // escreve a linha dentro do struct
                        saida.append("    ")
                                .append(cTipo).append(ptr ? "*" : "")
                                .append(" ").append(id.getText())
                                .append(base.equals("literal") ? "[80]" : "")
                                .append(";\n");
                    }
                }
                saida.append("} ").append(nomeTipo).append(";\n\n");

                // 2) registra esse novo tipo na tabela global
                pilhaDeTabelas.obterEscopoAtual().adicionar(
                        nomeTipo,
                        TipoEntrada.TIPO,
                        TipoT5.REGISTRO,
                        false,
                        registroTable,
                        false,
                        false);
            }
        } else if (ctx.declaracao_global() != null) {
            // você pode gerar protótipos de função/procedimento aqui, se precisar
            visitDeclaracao_global(ctx.declaracao_global());
        }
        return null;
    }

    @Override
    public Void visitDeclaracao_global(Declaracao_globalContext ctx) {
        // --- 1) cabeçalho: void ou tipo de retorno ---
        String nome = ctx.IDENT().getText();
        boolean isFuncao = ctx.FUNCAO() != null;

        StringBuilder cabecalho = new StringBuilder();
        if (isFuncao) {
            // mapeia tipo estendido para C
            String ret = ctx.tipo_estendido().getText().toLowerCase();
            String cRet = ret.equals("real") ? "float"
                    : ret.equals("literal") ? "char *"
                            : "int";
            cabecalho.append(cRet).append(" ");
        } else {
            cabecalho.append("void ");
        }
        cabecalho.append(nome).append("(");

        // --- 2) parâmetros (se houver) ---
        if (ctx.parametros() != null) {
            ParametrosContext pCtx = ctx.parametros();
            List<String> lista = new ArrayList<>();
            for (ParametroContext p : pCtx.parametro()) {
                boolean isVar = p.VAR() != null;
                String base = p.tipo_estendido().tipo_basico_ident().getText().toLowerCase();
                String cTipo = base.equals("real") ? "float"
                        : base.equals("literal") ? "char *"
                                : "int";
                if (isVar)
                    cTipo += " *"; // passagem por referência vira ponteiro
                // cada identificador
                for (IdentificadorContext id : p.identificador()) {
                    lista.add(cTipo + " " + id.getText());
                    // registra parâmetro no escopo
                    pilhaDeTabelas.obterEscopoAtual().adicionar(id.getText(),
                            base.equals("real") ? TipoT5.REAL
                                    : base.equals("literal") ? TipoT5.LITERAL
                                            : TipoT5.INTEIRO);
                }
            }
            cabecalho.append(String.join(", ", lista));
        }
        cabecalho.append(") {\n");
        saida.append(cabecalho);

        // --- 3) novo escopo para variáveis locais ---
        pilhaDeTabelas.criarNovoEscopo();
        // 3.a) declarações locais
        for (Declaracao_localContext loc : ctx.declaracao_local()) {
            visitDeclaracao_local(loc); // reutilize seu gerador de locais
        }
        // 3.b) comandos do corpo
        for (CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        // 3.c) se for função, garantimos que o visitCmdRetorne gerou um return …;
        if (isFuncao) {
            saida.append(" return 0;\n");
        }
        pilhaDeTabelas.abandonarEscopo();

        // --- 4) fecha a função/procedimento ---
        saida.append("}\n\n");
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
        } else if (ctx.cmdPara() != null) {
            return visitCmdPara(ctx.cmdPara());
        } else if (ctx.cmdChamada() != null) {
            return visitCmdChamada(ctx.cmdChamada());
        } else if (ctx.cmdRetorne() != null) {
            return visitCmdRetorne(ctx.cmdRetorne());
        } else if (ctx.cmdFaca() != null) {
            return visitCmdFaca(ctx.cmdFaca());
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
            TipoT5 tipo = T5SemanticoUtils.verificarTipo(pilhaDeTabelas, eCtx);
            String txt = eCtx.getText();
            if (tipo == TipoT5.LITERAL && txt.startsWith("\"") && txt.endsWith("\"")) {
                // literal puro: imprime o texto diretamente
                saida.append("    printf(").append(txt).append(");\n");
            } else if (tipo == TipoT5.LITERAL) {
                // fallback para variáveis string
                saida.append("    printf(\"%s\", ").append(txt).append(");\n");
            } else {
                String fmt = (tipo == TipoT5.REAL ? "%f" : "%d");
                saida.append("    printf(\"").append(fmt).append("\", ").append(txt).append(");\n");
            }
        }
        return null;
    }

    @Override
    public Void visitCmdAtribuicao(CmdAtribuicaoContext ctx) {
        String alvo = ctx.identificador().getText();
        InfoIdentificador info = T5SemanticoUtils.verificarIdentificador(pilhaDeTabelas, ctx.identificador());
        // veja qual é o tipo da expressão à direita:
        TipoT5 tipoRhs = T5SemanticoUtils.verificarTipo(pilhaDeTabelas, ctx.expressao());

        if (info.tipo == TipoT5.LITERAL) {
            // strcpy para string
            saida.append("    strcpy(").append(alvo).append(", ");
            visitExpressao(ctx.expressao());
            saida.append(");\n");
        } else {
            if (tipoRhs == TipoT5.ENDERECO) {
                // atribuição de &x — NÃO desreferencia
                saida.append("    ").append(alvo).append(" = ");
            } else if (info.ehPonteiro) {
                // atribuição de valor para *ponteiro
                saida.append("    *").append(alvo).append(" = ");
            } else {
                // atribuição normal
                saida.append("    ").append(alvo).append(" = ");
            }
            visitExpressao(ctx.expressao());
            saida.append(";\n");
        }
        return null;
    }

    @Override
    public Void visitCmdFaca(T5Parser.CmdFacaContext ctx) {
        // abre o do {
        saida.append("    do {\n");
        for (T5Parser.CmdContext c : ctx.cmd())
            visitCmd(c);
        // decide a forma de while
        boolean primeiroNeg = ctx.expressao()
                .termo_logico(0)
                .fator_logico(0)
                .NAO() != null;
        if (primeiroNeg) {
            saida.append("    } while (");
            visitExpressao(ctx.expressao());
            saida.append(");\n");
        } else {
            saida.append("    } while (!(");
            visitExpressao(ctx.expressao());
            saida.append("));\n");
        }
        return null;
    }

    @Override
    public Void visitCmdRetorne(CmdRetorneContext ctx) {
        // emite um return <expressao>;
        saida.append("    return ");
        visitExpressao(ctx.expressao());
        saida.append(";\n");
        return null;
    }

    @Override
    public Void visitCmdSe(CmdSeContext ctx) {
        // abre o if
        saida.append("if(");
        visitExpressao(ctx.expressao());
        saida.append(") {\n");

        // separa os comandos em then e else
        List<CmdContext> thenCmds = new ArrayList<>();
        List<CmdContext> elseCmds = new ArrayList<>();
        boolean inElse = false;
        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode &&
                    ((TerminalNode) child).getSymbol().getType() == T5Parser.SENAO) {
                inElse = true;
            } else if (child instanceof T5Parser.CmdContext) {
                if (!inElse)
                    thenCmds.add((CmdContext) child);
                else
                    elseCmds.add((CmdContext) child);
            }
        }

        // gera o bloco then
        for (CmdContext c : thenCmds) {
            visitCmd(c);
        }
        saida.append("}\n");

        // gera o bloco else se houver
        if (!elseCmds.isEmpty()) {
            saida.append("else {\n");
            for (CmdContext c : elseCmds) {
                visitCmd(c);
            }
            saida.append("}\n");
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
    public Void visitCmdPara(CmdParaContext ctx) {
        String varControle = ctx.IDENT().getText();
        String exprInicial = ctx.exp_aritmetica(0).getText();
        String exprFinal = ctx.exp_aritmetica(1).getText();

        saida.append("for (").append(varControle).append(" = ").append(exprInicial)
                .append("; ").append(varControle).append(" <= ").append(exprFinal)
                .append("; ").append(varControle).append("++) {\n");

        for (CmdContext c : ctx.cmd()) {
            visitCmd(c);
        }
        saida.append("}\n");
        return null;
    }

    @Override
    public Void visitCmdCaso(CmdCasoContext ctx) {
        String expr = ctx.exp_aritmetica().getText();
        saida.append("switch(")
                .append(expr)
                .append(") {\n");

        for (Item_selecaoContext item : ctx.selecao().item_selecao()) {
            for (Numero_intervaloContext ni : item.constantes().numero_intervalo()) {
                String txt = ni.getText();
                if (txt.contains("..")) {
                    String[] p = txt.split("\\.\\.");
                    int ini = Integer.parseInt(p[0]);
                    int fim = Integer.parseInt(p[1]);
                    for (int v = ini; v <= fim; v++) {
                        saida.append("      case ").append(v).append(":\n");
                    }
                } else {
                    saida.append("      case ").append(txt).append(":\n");
                }
            }
            // comandos do case
            for (CmdContext cmd : item.cmd()) {
                // identa um nível extra para ficar bonitinho
                saida.append("         "); // 4 espaços para indentação, ajuste se necessário
                visitCmd(cmd);
            }
            saida.append("         break;\n"); // 4 espaços para indentação, ajuste se necessário
        }

        // bloco senao vira default
        if (ctx.SENAO() != null) {
            saida.append("   default:\n");
            for (CmdContext cmd : ctx.cmd()) {
                saida.append("      "); // 4 espaços para indentação, ajuste se necessário
                visitCmd(cmd);
            }
            saida.append("      break;\n");
        }

        saida.append("}\n");
        return null;
    }

    @Override
    public Void visitCmdChamada(T5Parser.CmdChamadaContext ctx) {
        // ex: proc_imprime("teste");
        String nome = ctx.IDENT().getText();
        saida.append("   ")
                .append(nome)
                .append("(");
        for (int i = 0; i < ctx.expressao().size(); i++) {
            if (i > 0)
                saida.append(", ");
            visitExpressao(ctx.expressao(i));
        }
        saida.append(");\n");
        return null;
    }

    @Override
    public Void visitExpressao(ExpressaoContext ctx) {
        visitTermo_logico(ctx.termo_logico(0));
        for (int i = 0; i < ctx.op_logico_1().size(); i++) {
            saida.append(" || ");
            visitTermo_logico(ctx.termo_logico(i + 1));
        }
        return null;
    }

    public String getSaida() {
        return saida.toString();
    }

    @Override
    public Void visitTermo_logico(Termo_logicoContext ctx) {
        visitFator_logico(ctx.fator_logico(0));
        for (int i = 0; i < ctx.op_logico_2().size(); i++) {
            saida.append(" && ");
            visitFator_logico(ctx.fator_logico(i + 1));
        }
        return null;
    }

    @Override
    public Void visitFator_logico(Fator_logicoContext ctx) {
        if (ctx.NAO() != null) {
            saida.append("!");
        }
        visitParcela_logica(ctx.parcela_logica());
        return null;
    }

    @Override
    public Void visitParcela_logica(Parcela_logicaContext ctx) {
        if (ctx.pl1 != null) {
            saida.append(ctx.pl1.getText().equals("verdadeiro") ? "1" : "0");
        } else {
            visitExp_relacional(ctx.pl2);
        }
        return null;
    }

    @Override
    public Void visitExp_relacional(Exp_relacionalContext ctx) {
        visitExp_aritmetica(ctx.exp_aritmetica(0));
        if (ctx.op_relacional() != null) {
            String op = ctx.op_relacional().getText().equals("=") ? "==" : ctx.op_relacional().getText();
            saida.append(" ").append(op).append(" ");
            visitExp_aritmetica(ctx.exp_aritmetica(1));
        }
        return null;
    }

    @Override
    public Void visitExp_aritmetica(T5Parser.Exp_aritmeticaContext ctx) {
        visitTermo(ctx.termo(0));
        for (int i = 0; i < ctx.op1().size(); i++) {
            saida.append(" ").append(ctx.op1(i).getText()).append(" ");
            visitTermo(ctx.termo(i + 1));
        }
        return null;
    }

    @Override
    public Void visitTermo(T5Parser.TermoContext ctx) {
        visitFator(ctx.fator(0));
        for (int i = 0; i < ctx.op2().size(); i++) {
            saida.append(" ").append(ctx.op2(i).getText()).append(" ");
            visitFator(ctx.fator(i + 1));
        }
        return null;
    }

    @Override
    public Void visitFator(T5Parser.FatorContext ctx) {
        visitParcela(ctx.parcela(0));
        for (int i = 0; i < ctx.op3().size(); i++) {
            saida.append(" ").append(ctx.op3(i).getText()).append(" ");
            visitParcela(ctx.parcela(i + 1));
        }
        return null;
    }

    @Override
    public Void visitParcela(T5Parser.ParcelaContext ctx) {
        if (ctx.op_unario() != null) {
            saida.append(ctx.op_unario().getText());
        }
        if (ctx.parcela_unario() != null) {
            visitParcela_unario(ctx.parcela_unario());
        } else {
            visitParcela_nao_unario(ctx.parcela_nao_unario());
        }
        return null;
    }

    @Override
    public Void visitParcela_unario(T5Parser.Parcela_unarioContext ctx) {
        if (ctx.p1 != null) {
            if (ctx.PONTEIRO() != null)
                saida.append("*");
            saida.append(ctx.p1.getText());
        } else if (ctx.p2 != null) {
            saida.append(ctx.p2.getText()).append("(");
            for (int i = 0; i < ctx.expressao().size(); i++) {
                if (i > 0)
                    saida.append(", ");
                visitExpressao(ctx.expressao(i));
            }
            saida.append(")");
        } else if (ctx.p3 != null) {
            saida.append(ctx.p3.getText());
        } else if (ctx.p4 != null) {
            saida.append(ctx.p4.getText());
        } else {
            // '(' expressao ')'
            saida.append("(");
            visitExpressao(ctx.p5);
            saida.append(")");
        }
        return null;
    }

    @Override
    public Void visitParcela_nao_unario(T5Parser.Parcela_nao_unarioContext ctx) {
        // &identificador ou cadeia
        if (ctx.pn1 != null) {
            saida.append("&").append(ctx.pn1.getText());
        } else {
            saida.append(ctx.pn2.getText());
        }
        return null;
    }

}