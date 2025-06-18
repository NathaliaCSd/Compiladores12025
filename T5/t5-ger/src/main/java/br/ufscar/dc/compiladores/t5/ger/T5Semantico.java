package br.ufscar.dc.compiladores.t5.ger;

import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoT5;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

// Construído usando Visitor
public class T5Semantico extends T5BaseVisitor<Void> {

    private Escopos pilhaDeTabelas = new Escopos();

    @Override
    public Void visitPrograma(T5Parser.ProgramaContext ctx) {
        T5SemanticoUtils.errosSemanticos.clear();
        pilhaDeTabelas.criarNovoEscopo(); // abre escopo global
        super.visitPrograma(ctx);
        pilhaDeTabelas.abandonarEscopo();
        return null;
    }

    @Override
    public Void visitCorpo(T5Parser.CorpoContext ctx) {
        pilhaDeTabelas.criarNovoEscopo(); // abre escopo do corpo
        super.visitCorpo(ctx);
        pilhaDeTabelas.abandonarEscopo();
        return null;
    }

    @Override
    public Void visitDeclaracao_local(T5Parser.Declaracao_localContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhaDeTabelas.obterEscopoAtual();

        // Caso 1: “declare variavel”
        if (ctx.DECLARE() != null) {
            T5Parser.VariavelContext varCtx = ctx.var1;
            String strTipoVar = varCtx.tipo().getText().toLowerCase();

            // 1.1) tipo não declarado?
            if (!T5SemanticoUtils.ehTipoBasico(strTipoVar)) {
                String erro = "tipo " + strTipoVar + " nao declarado";
                T5SemanticoUtils.adicionarErroSemantico(varCtx.tipo().start, erro);
                // cadastra tudo como INVALIDO para evitar cascata
                for (T5Parser.IdentificadorContext idCtx : varCtx.identificador()) {
                    String nomeVar = idCtx.getText();
                    Token t = idCtx.start;
                    if (escopoAtual.existe(nomeVar)) {
                        String erroRedeclara = "identificador " + nomeVar + " ja declarado anteriormente";
                        T5SemanticoUtils.adicionarErroSemantico(t, erroRedeclara);
                    } else {
                        escopoAtual.adicionar(nomeVar, TipoT5.INVALIDO);
                    }
                }
            } else {
                // 1.2) converte para enum
                TipoT5 tipoVar = TipoT5.INVALIDO;
                switch (strTipoVar) {
                    case "inteiro":
                        tipoVar = TipoT5.INTEIRO;
                        break;
                    case "real":
                        tipoVar = TipoT5.REAL;
                        break;
                    case "literal":
                        tipoVar = TipoT5.LITERAL;
                        break;
                    case "logico":
                        tipoVar = TipoT5.LOGICO;
                        break;
                    case "registro":
                        tipoVar = TipoT5.REGISTRO;
                        break;
                    default:
                        // Nunca irá acontecer, pois o analisador sintático
                        // não permite
                        break;
                }
                // 1.3) adiciona cada identificador, checando redeclaração
                for (T5Parser.IdentificadorContext idCtx : varCtx.identificador()) {
                    String nomeVar = idCtx.getText();
                    Token t = idCtx.start;
                    if (escopoAtual.existe(nomeVar)) {
                        String erroRedeclara = "identificador " + nomeVar + " ja declarado anteriormente";
                        T5SemanticoUtils.adicionarErroSemantico(t, erroRedeclara);
                    } else {
                        escopoAtual.adicionar(nomeVar, tipoVar);
                    }
                }
            }

        // Caso 2: “constante IDENT : tipo_basico = valor”
        } else if (ctx.CONSTANTE() != null) {
            TerminalNode idNode = (TerminalNode) ctx.var2;
            Token tokenConst = idNode.getSymbol();
            String nomeConst = idNode.getText();
            String strTipoConst = ctx.tipo_basico().getText().toLowerCase();

            // 2.1) tipo básico válido?
            if (!T5SemanticoUtils.ehTipoBasico(strTipoConst)) {
                String erro = "tipo " + strTipoConst + " nao declarado";
                T5SemanticoUtils.adicionarErroSemantico(ctx.tipo_basico().start, erro);
                if (escopoAtual.existe(nomeConst)) {
                    String erroRedeclara = "identificador " + nomeConst + " ja declarado anteriormente";
                    T5SemanticoUtils.adicionarErroSemantico(tokenConst, erroRedeclara);
                } else {
                    escopoAtual.adicionar(nomeConst, TipoT5.INVALIDO);
                }
            } else {
                TipoT5 tipoConst = TipoT5.INVALIDO;
                switch (strTipoConst) {
                    case "inteiro": tipoConst = TipoT5.INTEIRO; 
                    break;
                    case "registro": tipoConst = TipoT5.REGISTRO; 
                    break;
                    case "real":    tipoConst = TipoT5.REAL;    
                    break;
                    case "literal": tipoConst = TipoT5.LITERAL; 
                    break;
                    case "logico":  tipoConst = TipoT5.LOGICO;  
                    break;
                }
                if (escopoAtual.existe(nomeConst)) {
                    String erroRedeclara = "identificador " + nomeConst + " ja declarado anteriormente";
                    T5SemanticoUtils.adicionarErroSemantico(tokenConst, erroRedeclara);
                } else {
                    escopoAtual.adicionar(nomeConst, tipoConst);
                }
            }

        // Caso 3: “tipo IDENT : tipo”
        } else if (ctx.TIPO() != null) {
            TerminalNode idNode = (TerminalNode) ctx.var3;
            Token tokenTipo = idNode.getSymbol();
            String nomeTipo = idNode.getText();
            T5Parser.TipoContext tipoCtx = ctx.tipo();

            boolean tipoValido = false;
            if (tipoCtx.registro() != null) {
                tipoValido = true;
            } else if (tipoCtx.tipo_estendido() != null) {
                T5Parser.Tipo_estendidoContext teCtx = tipoCtx.tipo_estendido();
                if (teCtx.PONTEIRO() != null) {
                    String apontado = teCtx.tipo_basico_ident().getText().toLowerCase();
                    if (T5SemanticoUtils.ehTipoBasico(apontado)) {
                        tipoValido = true;
                    } else {
                        for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
                            if (esc.existe(apontado)) {
                                tipoValido = true;
                                break;
                            }
                        }
                    }
                } else {
                    String nomeIdTipo = teCtx.getText().toLowerCase();
                    if (T5SemanticoUtils.ehTipoBasico(nomeIdTipo)) {
                        tipoValido = true;
                    } else {
                        for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
                            if (esc.existe(nomeIdTipo)) {
                                tipoValido = true;
                                break;
                            }
                        }
                    }
                }
            }

            if (!tipoValido) {
                String erro = "tipo " + tipoCtx.getText().toLowerCase() + " nao declarado";
                T5SemanticoUtils.adicionarErroSemantico(tokenTipo, erro);
                if (escopoAtual.existe(nomeTipo)) {
                    String erroRedeclara = "identificador " + nomeTipo + " ja declarado anteriormente";
                    T5SemanticoUtils.adicionarErroSemantico(tokenTipo, erroRedeclara);
                } else {
                    escopoAtual.adicionar(nomeTipo, TipoT5.INVALIDO);
                }
            } else {
                if (escopoAtual.existe(nomeTipo)) {
                    String erroRedeclara = "identificador " + nomeTipo + " ja declarado anteriormente";
                    T5SemanticoUtils.adicionarErroSemantico(tokenTipo, erroRedeclara);
                } else {
                    if (tipoCtx.registro() != null) {
                        escopoAtual.adicionar(nomeTipo, TipoT5.REGISTRO);
                    } else {
                        // Alias de tipo existente ou tipo básico: marcamos INVALIDO para não quebrar navegação
                        escopoAtual.adicionar(nomeTipo, TipoT5.INVALIDO);
                    }
                }
            }
        }

        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitCmdLeia(T5Parser.CmdLeiaContext ctx) {
        for (T5Parser.IdentificadorContext idCtx : ctx.identificador()) {
            String nomeId = idCtx.getText();
            boolean encontrado = false;
            for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (esc.existe(nomeId)) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                String erro = "identificador " + nomeId + " nao declarado";
                T5SemanticoUtils.adicionarErroSemantico(idCtx.start, erro);
            }
        }
        return null;
    }

    @Override
    public Void visitCmdEscreva(T5Parser.CmdEscrevaContext ctx) {
        for (T5Parser.ExpressaoContext exprCtx : ctx.expressao()) {
            visitExpressao(exprCtx);
        }
        return null;
    }

    @Override
    public Void visitCmdAtribuicao(T5Parser.CmdAtribuicaoContext ctx) {
        // 1) Checa existência do identificador à esquerda
        String nomeVar = ctx.identificador().getText();
        Token tokenVar = ctx.identificador().start;
        boolean encontrado = false;
        TabelaDeSimbolos escEncontrado = null;
        for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
            if (esc.existe(nomeVar)) {
                encontrado = true;
                escEncontrado = esc;
                break;
            }
        }
        if (!encontrado) {
            String erro = "identificador " + nomeVar + " nao declarado";
            T5SemanticoUtils.adicionarErroSemantico(tokenVar, erro);
        } else {
            // 2) Verifica compatibilidade de tipos
            TipoT5 tipoExpressao = T5SemanticoUtils.verificarTipo(pilhaDeTabelas, ctx.expressao());
            TipoT5 tipoId = escEncontrado.verificar(nomeVar);

            if (tipoExpressao == TipoT5.INVALIDO
                    || !(tipoExpressao.equals(tipoId)
                         || T5SemanticoUtils.ehTipoInteiroEmReal(tipoId, tipoExpressao))) {
                String erro = "atribuicao nao compativel para " + nomeVar;
                T5SemanticoUtils.adicionarErroSemantico(tokenVar, erro);
            }
        }
        return null;
    }

    @Override
    public Void visitExpressaoAritmetica(T5Parser.ExpressaoAritmeticaContext ctx) {
        T5SemanticoUtils.verificarTipo(pilhaDeTabelas, ctx);
        return super.visitExpressaoAritmetica(ctx);
    }

    @Override
    public Void visitParcela_unario(T5Parser.Parcela_unarioContext ctx) {
        if (ctx.p1 != null) {
            String nomeId = ctx.p1.getText();
            boolean encontrado = false;
            for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (esc.existe(nomeId)) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                String erro = "identificador " + nomeId + " nao declarado";
                T5SemanticoUtils.adicionarErroSemantico(ctx.p1.start, erro);
            }
        }
        return super.visitParcela_unario(ctx);
    }
}