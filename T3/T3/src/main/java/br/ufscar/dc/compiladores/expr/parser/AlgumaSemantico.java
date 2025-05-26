package br.ufscar.dc.compiladores.expr.parser;

import br.ufscar.dc.compiladores.expr.parser.AlgumaParser;
import br.ufscar.dc.compiladores.expr.parser.TabelaDeSimbolos.TipoAlguma;

public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {

    private TabelaDeSimbolos tabela;

    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDecl_local_global(AlgumaParser.Decl_local_globalContext ctx) {
        // pega nome e tipo da variável declarada
        String nomeVar = ctx.declaracao_local().variavel().getText();
        String strTipoVar = ctx.declaracao_local().tipo().getText().toLowerCase();
        TipoAlguma tipoVar = TipoAlguma.INVALIDO;
        switch (strTipoVar) {
            case "inteiro":
                tipoVar = TipoAlguma.INTEIRO;
                break;
            case "real":
                tipoVar = TipoAlguma.REAL;
                break;
            default:
                // tipos não numéricos não tratados aqui
                // nunca ira acontecer, pois o analisador sintatico nao permite
                break;
        }
        // verifica re-declaração (se a variavel ja foi declada)
        if (tabela.existe(nomeVar)) {
            AlgumaSemanticoUtils.adicionarErroSemantico(
                    ctx.declaracao_local().IDENT().getSymbol(),
                    "Variável '" + nomeVar + "' já existe");
        } else {
            tabela.adicionar(nomeVar, tipoVar);
        }
        return super.visitDecl_local_global(ctx);
    }

    @Override
    public Void visitCmdLeia(AlgumaParser.CmdLeiaContext ctx) {
        // para cada identificador em leia(...)
        for (AlgumaParser.IdentificadorContext idCtx : ctx.identificador()) {
            String nomeVar = idCtx.getText();
            if (!tabela.existe(nomeVar)) {
                AlgumaSemanticoUtils.adicionarErroSemantico(
                        idCtx.start,
                        "Variável '" + nomeVar + "' não foi declarada antes do uso");
            }
        }
        return super.visitCmdLeia(ctx);
    }

    @Override
    public Void visitCmdAtribuicao(AlgumaParser.CmdAtribuicaoContext ctx) {
        // 1) Nome da variável à esquerda
        String nomeVar = ctx.identificador().getText();
        // 2) Se não existe, erro de uso antes da declaração
        if (!tabela.existe(nomeVar)) {
            AlgumaSemanticoUtils.adicionarErroSemantico(
                    ctx.identificador().start,
                    "Variável '" + nomeVar + "' não foi declarada antes do uso");
        } else {
            // 3) Calcula tipo da expressão do lado direito
            AlgumaParser.ExpressaoContext expCtx = ctx.expressao();
            TabelaDeSimbolos.TipoAlguma tipoExp = AlgumaSemanticoUtils.verificarTipo(tabela, expCtx);
            // 4) Obtém tipo da variável na tabela
            TabelaDeSimbolos.TipoAlguma tipoVar = tabela.verificar(nomeVar);
            // 5) Se ambos válidos e diferentes, erro de incompatibilidade
            if (tipoExp != TabelaDeSimbolos.TipoAlguma.INVALIDO
                    && tipoVar != tipoExp) {
                AlgumaSemanticoUtils.adicionarErroSemantico(
                        ctx.identificador().start,
                        "Tipo da variável '" + nomeVar + "' não é compatível com o tipo da expressão");
            }
        }
        return super.visitCmdAtribuicao(ctx);
    }

}
