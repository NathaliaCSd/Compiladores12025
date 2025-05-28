package br.ufscar.dc.compiladores.expr.parser;

import br.ufscar.dc.compiladores.expr.parser.TabelaDeSimbolos.TipoAlguma;

public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {

    private TabelaDeSimbolos tabela;

    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }

        @Override
        public Void visitTipo_basico_ident(AlgumaParser.Tipo_basico_identContext ctx) {
            if (ctx.IDENT() != null) {
                String nomeTipo = ctx.IDENT().getText();
                
                if (!escopo.existe(nomeTipo)) {
                    AlgumaSemanticoUtils.adicionarErroSemantico(
                        ctx.IDENT().getSymbol(),
                        "tipo " + nomeTipo + " nao declarado"
                    );
                }
            }
            return null;
        }


    @Override
    public Void visitDecl_local_global(AlgumaParser.Decl_local_globalContext ctx) {
        if (ctx.declaracao_local() != null && ctx.declaracao_local().variavel() != null) {
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
                case "literal":
                    tipoVar = TipoAlguma.LITERAL;
                    break;
                default:
                    // Adiciona erro de tipo não declarado e NÃO adiciona variável na tabela
                    AlgumaSemanticoUtils.adicionarErroSemantico(
                        ctx.declaracao_local().tipo().start,
                        "tipo " + strTipoVar + " nao declarado"
                    );
                    return super.visitDecl_local_global(ctx);  // interrompe para não adicionar variável
            }

            if (tabela.existe(nomeVar)) {
                AlgumaSemanticoUtils.adicionarErroSemantico(
                    ctx.declaracao_local().IDENT().getSymbol(),
                    "Variável '" + nomeVar + "' já existe");
            } else {
                tabela.adicionar(nomeVar, tipoVar);
            }
        }
        return super.visitDecl_local_global(ctx);
    }

    @Override
    public Void visitCmdLeia(AlgumaParser.CmdLeiaContext ctx) {
        for (AlgumaParser.IdentificadorContext idCtx : ctx.identificador()) {
            String nomeVar = idCtx.getText();
            if (!tabela.existe(nomeVar)) {
                AlgumaSemanticoUtils.adicionarErroSemantico(
                        idCtx.start,
                        "identificador " + nomeVar + " nao declarado");
            }
        }
        return super.visitCmdLeia(ctx);
    }

    @Override
    public Void visitCmdAtribuicao(AlgumaParser.CmdAtribuicaoContext ctx) {
        String nomeVar = ctx.identificador().getText();
        if (!tabela.existe(nomeVar)) {
            AlgumaSemanticoUtils.adicionarErroSemantico(
                    ctx.identificador().start,
                    "identificador " + nomeVar + " nao declarado");
        } else {
            TipoAlguma tipoExp = AlgumaSemanticoUtils.verificarTipo(tabela, ctx.expressao());
            TipoAlguma tipoVar = tabela.verificar(nomeVar);
            if (tipoExp != TipoAlguma.INVALIDO && tipoVar != tipoExp) {
                AlgumaSemanticoUtils.adicionarErroSemantico(
                        ctx.identificador().start,
                        "Tipo da variável '" + nomeVar + "' não é compatível com o tipo da expressão");
            }
        }
        return super.visitCmdAtribuicao(ctx);
    }

    // REMOVIDO visitIdentificador para evitar verificação duplicada
}
