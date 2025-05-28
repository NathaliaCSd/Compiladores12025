package br.ufscar.dc.compiladores.expr.parser;

import br.ufscar.dc.compiladores.expr.parser.TabelaDeSimbolos.TipoAlguma;

public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {

    private TabelaDeSimbolos tabela;
    public static String extrairNome(AlgumaParser.IdentificadorContext ctx) {
        return ctx.IDENT(0).getText(); // pega apenas o identificador principal (ignora campos/indexações)
    }
    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }


    @Override
    public Void visitTipo_basico_ident(AlgumaParser.Tipo_basico_identContext ctx) {
        if (ctx.IDENT() != null) {
            String nomeTipo = ctx.IDENT().getText();
            if (!tabela.existe(nomeTipo)) {
                AlgumaSemanticoUtils.adicionarErroSemantico(
                        ctx.IDENT().getSymbol(),
                        "tipo " + nomeTipo + " nao declarado");
            }
        }
        return super.visitTipo_basico_ident(ctx);
    }

    @Override
    public Void visitDecl_local_global(AlgumaParser.Decl_local_globalContext ctx) {
        if (ctx.declaracao_local() != null && ctx.declaracao_local().variavel() != null) {
            AlgumaParser.VariavelContext varCtx = ctx.declaracao_local().variavel();
            //System.out.println("AlgumaParser.VariavelContext varCtx = ctx.declaracao_local().variavel(): "+varCtx);
            AlgumaParser.TipoContext tipoCtx = varCtx.tipo();
            //System.out.println("AlgumaParser.TipoContext tipoCtx = varCtx.tipo();: "+varCtx.tipo());
        
            String nomeTipo = tipoCtx.getText();
            TipoAlguma tipoVar;

            // Mapeia os tipos básicos
            
            switch (nomeTipo) {
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
                    // Tipo não reconhecido (pode ser definido pelo usuário)
                    if (!tabela.existe(nomeTipo)) {
                        AlgumaSemanticoUtils.adicionarErroSemantico(
                                tipoCtx.start,
                                "tipo " + nomeTipo + " nao declarado");
                    }
                    tipoVar = TipoAlguma.INVALIDO;
            }

            // Adiciona os identificadores à tabela
            for (AlgumaParser.IdentificadorContext idCtx : varCtx.identificador()) {
                String nomeVar = idCtx.getText();
                if (tabela.existe(nomeVar)) {
                    AlgumaSemanticoUtils.adicionarErroSemantico(
                            idCtx.start,
                            "identificador " + nomeVar + " ja declarado");
                } else {
                    tabela.adicionar(nomeVar, tipoVar);

                }
            }
        }

        return super.visitDecl_local_global(ctx);
    }

    @Override
    public Void visitCmdLeia(AlgumaParser.CmdLeiaContext ctx) {
        for (AlgumaParser.IdentificadorContext idCtx : ctx.identificador()) {
            String nomeVar = AlgumaSemanticoUtils.extrairNome(idCtx);
            if (!tabela.existe(nomeVar)) {
                AlgumaSemanticoUtils.adicionarErroSemantico(
                        idCtx.start,
                        "identificador " + nomeVar + " nao declarado:::   "+tabela.toString()+"   ::: nome var:"+nomeVar);
            }
        }
        return super.visitCmdLeia(ctx);
    }


    @Override
    public Void visitCmdAtribuicao(AlgumaParser.CmdAtribuicaoContext ctx) {
        String nomeVar = AlgumaSemanticoUtils.extrairNome(ctx.identificador());
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

}
