package br.ufscar.dc.compiladores.expr.parser;

import br.ufscar.dc.compiladores.expr.parser.TabelaDeSimbolos.TipoAlguma;
import org.antlr.v4.runtime.Token;

//construido usando visitor 
public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {

    // usado escopos para criar uma pilha de tabelas
    // como o prof fez nos exemplos
    private Escopos pilhaDeTabelas = new Escopos();
    private String erroSemantico;

    /**
     * Ponto de entrada do programa: limpa erros, inicia escopo global e
     * percorre toda a árvore. Ao final, encerra escopo global.
     */
    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {
        AlgumaSemanticoUtils.errosSemanticos.clear();
        pilhaDeTabelas.criarNovoEscopo(); // abre escopo global
        super.visitPrograma(ctx);
        pilhaDeTabelas.abandonarEscopo();
        return null;
    }

    @Override
    public Void visitCorpo(AlgumaParser.CorpoContext ctx) {
        pilhaDeTabelas.criarNovoEscopo(); // abre escopo para corpo
        super.visitCorpo(ctx); // processa declarações e comandos
        pilhaDeTabelas.abandonarEscopo(); // fecha escopo do corpo
        return null;
    }

    /**
     * Trata declarações locais: variáveis, constantes e tipos.
     * Aqui processamos o caso 'declare variavel'.
     */
    @Override
    public Void visitDeclaracao_local(AlgumaParser.Declaracao_localContext ctx) {
        // Obtém a tabela de símbolos do escopo atual
        TabelaDeSimbolos escopoAtual = pilhaDeTabelas.obterEscopoAtual();

        // Caso 1: declaração de variável via "declare"
        if (ctx.DECLARE() != null) {
            // Captura o contexto da regra variavel e extrai o tipo em texto
            AlgumaParser.VariavelContext varCtx = ctx.variavel();
            String strTipoVar = varCtx.tipo().getText().toLowerCase();

            // Verifica se o tipo é básico (literal, inteiro, real, logico)
            if (!AlgumaSemanticoUtils.ehTipoBasico(strTipoVar)) {
                erroSemantico = "tipo " + strTipoVar + " nao declarado";
                AlgumaSemanticoUtils.adicionarErroSemantico(
                        varCtx.tipo().start, erroSemantico);
            }

            // Converte string em enum TipoAlguma
            TipoAlguma tipoVar = TipoAlguma.INVALIDO;
            switch (strTipoVar) {
                case "INTEIRO":
                    tipoVar = TipoAlguma.INTEIRO;
                    break;
                case "REAL":
                    tipoVar = TipoAlguma.REAL;
                    break;
                default:
                    // Nunca irá acontecer, pois o analisador sintático
                    // não permite
                    break;
            }

            // verifica se a variavel ja foi declarada
            for (AlgumaParser.IdentificadorContext idCtx : varCtx.identificador()) {
                String nomeVar = idCtx.getText();
                if (escopoAtual.existe(nomeVar)) {
                    erroSemantico = "identificador " + nomeVar + " ja declarado anteriormente";
                    AlgumaSemanticoUtils.adicionarErroSemantico(
                            idCtx.start, erroSemantico);
                } else {
                    escopoAtual.adicionar(nomeVar, tipoVar);
                }
            }
        }
        // Outros casos (constante, tipo) podem ser implementados de modo similar
        return super.visitDeclaracao_local(ctx);
    }

    /**
     * Comando de leitura: verifica se cada variável já foi declarada em algum
     * escopo.
     */
    @Override
    public Void visitCmdLeia(AlgumaParser.CmdLeiaContext ctx) {
        for (AlgumaParser.IdentificadorContext idCtx : ctx.identificador()) {
            boolean encontrado = false;
            // Varre da tabela interna até a global
            for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (esc.existe(idCtx.getText())) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                erroSemantico = "identificador " + idCtx.getText() + " nao declarado";
                AlgumaSemanticoUtils.adicionarErroSemantico(
                        idCtx.start, erroSemantico);
            }
        }
        return null;
    }


    @Override
    public Void visitCmdEscreva(AlgumaParser.CmdEscrevaContext ctx) {
        for (AlgumaParser.ExpressaoContext exprCtx : ctx.expressao()) {
            visitExpressao(exprCtx);
        }
        return null;
    }

    @Override
    public Void visitCmdAtribuicao(AlgumaParser.CmdAtribuicaoContext ctx) {
        TipoAlguma tipoExpressao = AlgumaSemanticoUtils.verificarTipo(pilhaDeTabelas, ctx.expressao());
        TipoAlguma tipoId = pilhaDeTabelas.obterEscopoAtual()
                .verificar(ctx.identificador().getText());

        if (!(tipoExpressao.equals(tipoId) ||
                AlgumaSemanticoUtils.ehTipoInteiroEmReal(tipoId, tipoExpressao))) {
            erroSemantico = "atribuicao nao compativel para " +
                    ctx.identificador().getText();
            AlgumaSemanticoUtils.adicionarErroSemantico(
                    ctx.start, erroSemantico);
        }
        return null;
    }

    @Override
    public Void visitExp_aritmetica(AlgumaParser.Exp_aritmeticaContext ctx) {
        AlgumaSemanticoUtils.verificarTipo(pilhaDeTabelas, ctx);
        return super.visitExp_aritmetica(ctx);
    }
}
