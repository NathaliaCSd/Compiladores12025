package br.ufscar.dc.compiladores.t5.ger;

import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoT5;

import br.ufscar.dc.compiladores.t5.ger.T5Parser.CmdChamadaContext;
import br.ufscar.dc.compiladores.t5.ger. T5Parser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.t5.ger. T5Parser.Declaracao_localContext;
import br.ufscar.dc.compiladores.t5.ger. T5Parser.ParametroContext;
import br.ufscar.dc.compiladores.t5.ger. T5Parser.VariavelContext;
import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.EntradaTabelaDeSimbolos;
import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoEntrada;

public class T5Semantico extends T5BaseVisitor<Void> {
    Escopos pilhaDeTabelas = new Escopos();
    private EntradaTabelaDeSimbolos subRotinaAtual = null;

    @Override public Void visitPrograma(T5Parser.ProgramaContext ctx) { super.visitPrograma(ctx); return null; }

    @Override
    public Void visitDeclaracao_global(Declaracao_globalContext ctx) {
        TabelaDeSimbolos escopoGlobal = pilhaDeTabelas.obterEscopoAtual();
        String nomeSubRotina = ctx.IDENT().getText();
        if (escopoGlobal.existe(nomeSubRotina)) {
            T5SemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeSubRotina + " ja declarado anteriormente");
            return null;
        }

        if (ctx.start.getText().equals("funcao")) {
            TipoT5 tipoRetorno = T5SemanticoUtils.getTipo(ctx.tipo_estendido().getText());
            escopoGlobal.adicionarFuncao(nomeSubRotina, tipoRetorno);
        } else {
            escopoGlobal.adicionarProcedimento(nomeSubRotina);
        }
        subRotinaAtual = escopoGlobal.getEntrada(nomeSubRotina);

        pilhaDeTabelas.criarNovoEscopo();
        TabelaDeSimbolos escopoLocal = pilhaDeTabelas.obterEscopoAtual();

        if (ctx.parametros() != null) {
            for (ParametroContext pCtx : ctx.parametros().parametro()) {
                boolean ehVarParam = pCtx.VAR() != null;
                String nomeTipoParam = pCtx.tipo_estendido().getText();
                boolean ehPonteiro = nomeTipoParam.startsWith("^");
                if(ehPonteiro) nomeTipoParam = nomeTipoParam.substring(1);
                
                TipoT5 tipoParam = TipoT5.INVALIDO;
                TabelaDeSimbolos tabelaDoTipoParam = null;

                if(T5SemanticoUtils.ehTipoBasico(nomeTipoParam)) {
                    tipoParam = T5SemanticoUtils.getTipo(nomeTipoParam);
                } else {
                    EntradaTabelaDeSimbolos entradaTipo = pilhaDeTabelas.obterEntrada(nomeTipoParam);
                    if(entradaTipo != null && entradaTipo.getTipoEntrada() == TipoEntrada.TIPO) {
                        tipoParam = entradaTipo.getTipo();
                        tabelaDoTipoParam = entradaTipo.getRegistro();
                    } else {
                        T5SemanticoUtils.adicionarErroSemantico(pCtx.tipo_estendido().start, "tipo " + nomeTipoParam + " nao declarado");
                    }
                }

                if(tipoParam != TipoT5.INVALIDO) {
                    for(var idCtx : pCtx.identificador()){
                        String nomeParam = idCtx.IDENT(0).getText();
                        boolean ehVetorParam = !idCtx.dimensao().getText().isEmpty();
                        if(escopoLocal.existe(nomeParam)) {
                            T5SemanticoUtils.adicionarErroSemantico(idCtx.start, "identificador " + nomeParam + " ja declarado anteriormente");
                        } else {
                            escopoLocal.adicionar(nomeParam, TipoEntrada.VARIAVEL, tipoParam, ehPonteiro, tabelaDoTipoParam, ehVetorParam, ehVarParam);
                            escopoGlobal.adicionarParametro(nomeSubRotina, escopoLocal.getEntrada(nomeParam));
                        }
                    }
                }
            }
        }
        
        for(var decl : ctx.declaracao_local()) visitDeclaracao_local(decl);
        for(var cmd : ctx.cmd()) visitCmd(cmd);
        pilhaDeTabelas.abandonarEscopo();
        subRotinaAtual = null;
        return null;
    }

    @Override
    public Void visitCmdRetorne(T5Parser.CmdRetorneContext ctx) {
        if (subRotinaAtual == null || subRotinaAtual.getTipoEntrada() != TipoEntrada.FUNCAO) {
            T5SemanticoUtils.adicionarErroSemantico(ctx.start, "comando retorne nao permitido nesse escopo");
        } else {
            TipoT5 tipoRetornoEsperado = subRotinaAtual.getTipoRetorno();
            TipoT5 tipoRetornoVerificado = T5SemanticoUtils.verificarTipo(pilhaDeTabelas, ctx.expressao());
            if (tipoRetornoVerificado != tipoRetornoEsperado && !T5SemanticoUtils.ehTipoInteiroEmReal(tipoRetornoEsperado, tipoRetornoVerificado)) {
                T5SemanticoUtils.adicionarErroSemantico(ctx.start, "tipo de retorno incompativel");
            }
        }
        return super.visitCmdRetorne(ctx);
    }
    
    @Override public Void visitCorpo(T5Parser.CorpoContext ctx) { pilhaDeTabelas.criarNovoEscopo(); super.visitCorpo(ctx); pilhaDeTabelas.abandonarEscopo(); return null; }
    
    public void declaracaoVariavel(VariavelContext ctx){
        TabelaDeSimbolos escopoAtual = pilhaDeTabelas.obterEscopoAtual();
        String nomeTipo = ctx.tipo().getText();
        TipoT5 tipoVar = TipoT5.INVALIDO;
        TabelaDeSimbolos tabelaDoTipo = null;
        boolean ehPonteiro = false;

        if (ctx.tipo().tipo_estendido() != null && ctx.tipo().tipo_estendido().getText().startsWith("^")) {
            ehPonteiro = true;
            nomeTipo = nomeTipo.substring(1);
        }
        if (ctx.tipo().registro() != null) {
            tipoVar = TipoT5.REGISTRO;
            pilhaDeTabelas.criarNovoEscopo();
            for (var v : ctx.tipo().registro().variavel()) declaracaoVariavel(v);
            tabelaDoTipo = pilhaDeTabelas.obterEscopoAtual();
            pilhaDeTabelas.abandonarEscopo();
        } else { 
            if (T5SemanticoUtils.ehTipoBasico(nomeTipo)) tipoVar = T5SemanticoUtils.getTipo(nomeTipo);
            else {
                EntradaTabelaDeSimbolos entrada = pilhaDeTabelas.obterEntrada(nomeTipo);
                if(entrada != null && entrada.getTipoEntrada() == TipoEntrada.TIPO) {
                    tipoVar = entrada.getTipo();
                    tabelaDoTipo = entrada.getRegistro();
                } else {
                    T5SemanticoUtils.adicionarErroSemantico(ctx.tipo().start, "tipo " + nomeTipo + " nao declarado");
                    return;
                }
            }
        }
        for (var idCtx : ctx.identificador()){
            String nomeVariavel = idCtx.IDENT(0).getText();
            // Verificação hierárquica para evitar conflito com constantes ou sub-rotinas globais.
            if (pilhaDeTabelas.obterEntrada(nomeVariavel) != null) {
                T5SemanticoUtils.adicionarErroSemantico(idCtx.start, "identificador " + nomeVariavel + " ja declarado anteriormente");
            } else {
                boolean ehVetor = !idCtx.dimensao().getText().isEmpty();
                escopoAtual.adicionar(nomeVariavel, TipoEntrada.VARIAVEL, tipoVar, ehPonteiro, tabelaDoTipo, ehVetor, false);
            }
        }
    }
    
    // NOVO MÉTODO
    public void declaracaoConstante(Declaracao_localContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhaDeTabelas.obterEscopoAtual();
        String nomeConst = ctx.var2.getText();

        // Verificação hierárquica
        if (pilhaDeTabelas.obterEntrada(nomeConst) != null) {
            T5SemanticoUtils.adicionarErroSemantico(ctx.var2, "identificador " + nomeConst + " ja declarado anteriormente");
        } else {
            TipoT5 tipoConst = T5SemanticoUtils.getTipo(ctx.tipo_basico().getText());
            // O valor não é armazenado pois não é usado na análise semântica, mas poderia ser.
            escopoAtual.adicionarConstante(nomeConst, tipoConst, null);
        }
    }

    public void declaracaoTipo(Declaracao_localContext ctx){
        TabelaDeSimbolos escopoAtual = pilhaDeTabelas.obterEscopoAtual();
        String nomeTipo = ctx.var3.getText();
        if (pilhaDeTabelas.obterEntrada(nomeTipo) != null) {
            T5SemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + nomeTipo + " ja declarado anteriormente");
            return;
        }
        T5Parser.TipoContext tipoCtx = ctx.tipo();
        if (tipoCtx.registro() != null) {
            pilhaDeTabelas.criarNovoEscopo();
            for(var variavelRegistro : tipoCtx.registro().variavel()) declaracaoVariavel(variavelRegistro);
            TabelaDeSimbolos tabelaDoRegistro = pilhaDeTabelas.obterEscopoAtual();
            pilhaDeTabelas.abandonarEscopo();
            escopoAtual.adicionar(nomeTipo, TipoEntrada.TIPO, TipoT5.REGISTRO, false, tabelaDoRegistro, false, false);
        }
    }
    
    @Override public Void visitDeclaracao_local(Declaracao_localContext ctx){
        if (ctx.var1 != null) {
            declaracaoVariavel(ctx.var1);
        } else if (ctx.var2 != null) {
            declaracaoConstante(ctx);
        } else if (ctx.var3 != null) {
            declaracaoTipo(ctx);
        }
        return null;
    }
    
    @Override public Void visitCmdLeia(T5Parser.CmdLeiaContext ctx){ for (var v : ctx.identificador()) T5SemanticoUtils.verificarIdentificador(pilhaDeTabelas, v); return null; }
    @Override public Void visitCmdEscreva(T5Parser.CmdEscrevaContext ctx){ for (var e : ctx.expressao()) T5SemanticoUtils.verificarTipo(pilhaDeTabelas, e); return null; }
    
    @Override
    public Void visitCmdAtribuicao(T5Parser.CmdAtribuicaoContext ctx) { 
        InfoIdentificador infoLhs = T5SemanticoUtils.verificarIdentificador(pilhaDeTabelas, ctx.identificador());
        if (infoLhs.tipo == TipoT5.INVALIDO) return null;
        TipoT5 tipoRhs = T5SemanticoUtils.verificarTipo(pilhaDeTabelas, ctx.expressao());
        boolean isLhsDereferenced = ctx.getText().startsWith("^");
        String nomeLhs = ctx.identificador().getText();
        if (isLhsDereferenced) { 
            if (!infoLhs.ehPonteiro) { T5SemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeLhs + " nao e um ponteiro"); return null; }
            TipoT5 tipoBaseLhs = infoLhs.tipo;
            if (!tipoRhs.equals(tipoBaseLhs) && !T5SemanticoUtils.ehTipoInteiroEmReal(tipoBaseLhs, tipoRhs)) T5SemanticoUtils.adicionarErroSemantico(ctx.start, "atribuicao nao compativel para ^" + nomeLhs);
        } else {
            if (tipoRhs == TipoT5.ENDERECO) {
                if (!infoLhs.ehPonteiro) T5SemanticoUtils.adicionarErroSemantico(ctx.start, "atribuicao nao compativel para " + nomeLhs);
                else {
                    T5Parser.Parcela_nao_unarioContext pnuCtx = ctx.expressao().termo_logico(0).fator_logico(0).parcela_logica().exp_relacional().exp_aritmetica(0).termo(0).fator(0).parcela(0).parcela_nao_unario();
                    if(pnuCtx != null && pnuCtx.pn1 != null) { 
                        InfoIdentificador infoRhs = T5SemanticoUtils.verificarIdentificador(pilhaDeTabelas, pnuCtx.pn1);
                        if (infoRhs.tipo != TipoT5.INVALIDO && infoLhs.tipo != infoRhs.tipo) T5SemanticoUtils.adicionarErroSemantico(ctx.start, "atribuicao nao compativel para " + nomeLhs);
                    }
                }
            } else {
                if (infoLhs.ehPonteiro) { T5SemanticoUtils.adicionarErroSemantico(ctx.start, "atribuicao nao compativel para " + nomeLhs); return null; }
                if (infoLhs.tipo == TipoT5.REGISTRO && tipoRhs == TipoT5.REGISTRO) return null;
                if (!tipoRhs.equals(infoLhs.tipo) && !T5SemanticoUtils.ehTipoInteiroEmReal(infoLhs.tipo, tipoRhs)) T5SemanticoUtils.adicionarErroSemantico(ctx.start, "atribuicao nao compativel para " + nomeLhs);
            }
        }
        return null;
    }

    @Override public Void visitCmdSe(T5Parser.CmdSeContext ctx) { T5SemanticoUtils.verificarTipo(pilhaDeTabelas, ctx.expressao()); super.visitCmdSe(ctx); return null; }
    
    @Override
    public Void visitCmdChamada(CmdChamadaContext ctx) {
        String nomeProc = ctx.IDENT().getText();
        EntradaTabelaDeSimbolos entrada = pilhaDeTabelas.obterEntrada(nomeProc);
        if(entrada == null) { T5SemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeProc + " nao declarado"); return null; }
        if(entrada.getTipoEntrada() != TipoEntrada.PROCEDIMENTO) { T5SemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeProc + " nao e um procedimento"); return null; }
        T5SemanticoUtils.verificarParametros(pilhaDeTabelas, entrada, ctx.expressao(), ctx.start);
        return null;
    }
}