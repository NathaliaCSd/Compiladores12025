package br.ufscar.dc.compiladores.t5.ger;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.EntradaTabelaDeSimbolos;
import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoT5;
import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoEntrada;

class InfoIdentificador {
    public TipoT5 tipo;
    public boolean ehPonteiro;
    public boolean ehVetor;
    public TabelaDeSimbolos tabelaDoRegistro;

    public InfoIdentificador(TipoT5 tipo, boolean ehPonteiro, boolean ehVetor, TabelaDeSimbolos tabela) {
        this.tipo = tipo;
        this.ehPonteiro = ehPonteiro;
        this.ehVetor = ehVetor;
        this.tabelaDoRegistro = tabela;
    }
}

public class T5SemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        String erro = String.format("Linha %d: %s", linha, mensagem);
        if (!errosSemanticos.contains(erro))
            errosSemanticos.add(erro);
    }

    public static boolean ehTipoBasico(String tipoVar) {
        return tipoVar.equals("literal") || tipoVar.equals("inteiro") || tipoVar.equals("real")
                || tipoVar.equals("logico");
    }

    public static TipoT5 getTipo(String tipoStr) {
        if (tipoStr.startsWith("^"))
            tipoStr = tipoStr.substring(1);
        switch (tipoStr) {
            case "literal":
                return TipoT5.LITERAL;
            case "inteiro":
                return TipoT5.INTEIRO;
            case "real":
                return TipoT5.REAL;
            case "logico":
                return TipoT5.LOGICO;
            default:
                return TipoT5.INVALIDO;
        }
    }

    public static boolean ehTipoNumeral(TipoT5 t1, TipoT5 t2) {
        return (t1 == TipoT5.INTEIRO && t2 == TipoT5.REAL) || (t1 == TipoT5.REAL && t2 == TipoT5.INTEIRO);
    }

    public static boolean ehTipoInteiroEmReal(TipoT5 t1, TipoT5 t2) {
        return t1 == TipoT5.REAL && t2 == TipoT5.INTEIRO;
    }

    public static InfoIdentificador verificarIdentificador(Escopos pilhaDeTabelas, T5Parser.IdentificadorContext ctx) {
        String nomeCompleto = ctx.getText();
        String nomeBase = ctx.IDENT(0).getText();
        EntradaTabelaDeSimbolos entradaBase = pilhaDeTabelas.obterEntrada(nomeBase);
        if (entradaBase == null) {
            adicionarErroSemantico(ctx.start, "identificador " + nomeCompleto + " nao declarado");
            return new InfoIdentificador(TipoT5.INVALIDO, false, false, null);
        }
        boolean acessoVetor = !ctx.dimensao().getText().isEmpty();
        if (acessoVetor) {
            if (!entradaBase.isVetor()) {
                adicionarErroSemantico(ctx.start, "identificador " + nomeBase + " nao e um vetor");
                return new InfoIdentificador(TipoT5.INVALIDO, false, false, null);
            }
            for (var exp : ctx.dimensao().exp_aritmetica()) {
                if (verificarTipo(pilhaDeTabelas, exp) != TipoT5.INTEIRO)
                    adicionarErroSemantico(exp.start, "indice de vetor deve ser inteiro");
            }
        }
        TipoT5 tipoResultante = entradaBase.getTipo();
        boolean ehPonteiroResultante = entradaBase.isPonteiro();
        boolean ehVetorResultante = acessoVetor ? false : entradaBase.isVetor();
        TabelaDeSimbolos tabelaDoTipo = entradaBase.getRegistro();
        if (ctx.IDENT().size() > 1) {
            if (tipoResultante != TipoT5.REGISTRO) {
                adicionarErroSemantico(ctx.start, "identificador " + nomeBase + " nao e um registro");
                return new InfoIdentificador(TipoT5.INVALIDO, false, false, null);
            }
            for (int i = 1; i < ctx.IDENT().size(); i++) {
                String nomeCampo = ctx.IDENT(i).getText();
                if (tabelaDoTipo == null || !tabelaDoTipo.existe(nomeCampo)) {
                    adicionarErroSemantico(ctx.start, "identificador " + nomeCompleto + " nao declarado");
                    return new InfoIdentificador(TipoT5.INVALIDO, false, false, null);
                }
                EntradaTabelaDeSimbolos entradaCampo = tabelaDoTipo.getEntrada(nomeCampo);
                tipoResultante = entradaCampo.getTipo();
                ehPonteiroResultante = entradaCampo.isPonteiro();
                tabelaDoTipo = entradaCampo.getRegistro();
            }
        }
        return new InfoIdentificador(tipoResultante, ehPonteiroResultante, ehVetorResultante, tabelaDoTipo);
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.ExpressaoContext ctx) {
        if (ctx == null)
            return TipoT5.INVALIDO;
        if (ctx.termo_logico().isEmpty())
            return TipoT5.INVALIDO;
        TipoT5 tipoResultante = verificarTipo(pilhaDeTabelas, ctx.termo_logico(0));
        for (int i = 1; i < ctx.termo_logico().size(); i++) {
            TipoT5 proximoTipo = verificarTipo(pilhaDeTabelas, ctx.termo_logico(i));
            if (tipoResultante != TipoT5.LOGICO || proximoTipo != TipoT5.LOGICO)
                return TipoT5.INVALIDO;
        }
        return tipoResultante;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Termo_logicoContext ctx) {
        if (ctx == null)
            return TipoT5.INVALIDO;
        if (ctx.fator_logico().isEmpty())
            return TipoT5.INVALIDO;
        TipoT5 tipoResultante = verificarTipo(pilhaDeTabelas, ctx.fator_logico(0));
        for (int i = 1; i < ctx.fator_logico().size(); i++) {
            TipoT5 proximoTipo = verificarTipo(pilhaDeTabelas, ctx.fator_logico(i));
            if (tipoResultante != TipoT5.LOGICO || proximoTipo != TipoT5.LOGICO)
                return TipoT5.INVALIDO;
        }
        return tipoResultante;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Fator_logicoContext ctx) {
        if (ctx == null)
            return TipoT5.INVALIDO;
        return verificarTipo(pilhaDeTabelas, ctx.parcela_logica());
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Parcela_logicaContext ctx) {
        if (ctx == null)
            return TipoT5.INVALIDO;
        if (ctx.pl1 != null)
            return TipoT5.LOGICO;
        return verificarTipo(pilhaDeTabelas, ctx.pl2);
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Exp_relacionalContext ctx) {
        if (ctx == null)
            return TipoT5.INVALIDO;
        if (ctx.exp_aritmetica().isEmpty())
            return TipoT5.INVALIDO;
        TipoT5 tipo1 = verificarTipo(pilhaDeTabelas, ctx.exp_aritmetica(0));
        if (ctx.op_relacional() == null)
            return tipo1;
        TipoT5 tipo2 = verificarTipo(pilhaDeTabelas, ctx.exp_aritmetica(1));
        if (tipo1 == TipoT5.INVALIDO || tipo2 == TipoT5.INVALIDO)
            return TipoT5.INVALIDO;
        if (ehTipoNumeral(tipo1, tipo2) || (tipo1 == tipo2))
            return TipoT5.LOGICO;
        return TipoT5.INVALIDO;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Exp_aritmeticaContext ctx) {
        if (ctx == null)
            return TipoT5.INVALIDO;
        if (ctx.termo().isEmpty())
            return TipoT5.INVALIDO;
        TipoT5 tipoResultante = verificarTipo(pilhaDeTabelas, ctx.termo(0));
        for (int i = 1; i < ctx.termo().size(); i++) {
            TipoT5 proximoTipo = verificarTipo(pilhaDeTabelas, ctx.termo(i));
            if (proximoTipo == TipoT5.INVALIDO)
                return TipoT5.INVALIDO;
            if (ehTipoNumeral(tipoResultante, proximoTipo))
                tipoResultante = TipoT5.REAL;
            else if (tipoResultante == TipoT5.LITERAL && proximoTipo == TipoT5.LITERAL)
                tipoResultante = TipoT5.LITERAL;
            else if (tipoResultante != proximoTipo)
                return TipoT5.INVALIDO;
        }
        return tipoResultante;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.TermoContext ctx) {
        if (ctx == null)
            return TipoT5.INVALIDO;
        if (ctx.fator().isEmpty())
            return TipoT5.INVALIDO;
        TipoT5 tipoResultante = verificarTipo(pilhaDeTabelas, ctx.fator(0));
        for (int i = 1; i < ctx.fator().size(); i++) {
            TipoT5 proximoTipo = verificarTipo(pilhaDeTabelas, ctx.fator(i));
            if (proximoTipo == TipoT5.INVALIDO)
                return TipoT5.INVALIDO;
            if (ehTipoNumeral(tipoResultante, proximoTipo))
                tipoResultante = TipoT5.REAL;
            else if (tipoResultante != proximoTipo)
                return TipoT5.INVALIDO;
        }
        return tipoResultante;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.FatorContext ctx) {
        if (ctx == null || ctx.parcela().isEmpty())
            return TipoT5.INVALIDO;
        return verificarTipo(pilhaDeTabelas, ctx.parcela(0));
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.ParcelaContext ctx) {
        if (ctx == null)
            return TipoT5.INVALIDO;
        if (ctx.parcela_unario() != null) {
            return verificarTipo(pilhaDeTabelas, ctx.parcela_unario());
        } else {
            return verificarTipo(pilhaDeTabelas, ctx.parcela_nao_unario());
        }
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Parcela_nao_unarioContext ctx) {
        if (ctx.pn1 != null) {
            if (ctx.getText().startsWith("&"))
                return TipoT5.ENDERECO;
            return verificarIdentificador(pilhaDeTabelas, ctx.pn1).tipo;
        } else {
            return TipoT5.LITERAL;
        }
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Parcela_unarioContext ctx) {
        if (ctx.p1 != null)
            return verificarIdentificador(pilhaDeTabelas, ctx.p1).tipo;
        if (ctx.p3 != null)
            return TipoT5.INTEIRO;
        if (ctx.p4 != null)
            return TipoT5.REAL;
        if (ctx.p5 != null)
            return verificarTipo(pilhaDeTabelas, ctx.p5);

        if (ctx.p2 != null) {
            String nomeSubRotina = ctx.p2.getText();
            EntradaTabelaDeSimbolos entrada = pilhaDeTabelas.obterEntrada(nomeSubRotina);
            if (entrada == null) {
                adicionarErroSemantico(ctx.p2, "identificador " + nomeSubRotina + " nao declarado");
                return TipoT5.INVALIDO;
            }
            if (entrada.getTipoEntrada() != TipoEntrada.FUNCAO) {
                adicionarErroSemantico(ctx.p2, "identificador " + nomeSubRotina + " nao e uma funcao");
                return TipoT5.INVALIDO;
            }
            verificarParametros(pilhaDeTabelas, entrada, ctx.expressao(), ctx.p2);
            return entrada.getTipoRetorno();
        }
        return TipoT5.INVALIDO;
    }

    public static void verificarParametros(Escopos pilhaDeTabelas, EntradaTabelaDeSimbolos subRotina,
            List<T5Parser.ExpressaoContext> args, Token tokenChamada) {
        List<EntradaTabelaDeSimbolos> paramsEsperados = subRotina.getParametros();
        if (paramsEsperados.size() != args.size()) {
            adicionarErroSemantico(tokenChamada, "incompatibilidade de parametros na chamada de " + subRotina.nome);
            return;
        }
        for (int i = 0; i < args.size(); i++) {
            EntradaTabelaDeSimbolos paramEsperado = paramsEsperados.get(i);
            TipoT5 tipoFornecido = verificarTipo(pilhaDeTabelas, args.get(i));

            if (paramEsperado.isVar()) {
                // Lógica de verificação para parâmetros 'var' (passados por referência)
                T5Parser.IdentificadorContext idCtx = null;
                try {
                    idCtx = args.get(i).termo_logico(0).fator_logico(0).parcela_logica().exp_relacional()
                            .exp_aritmetica(0).termo(0).fator(0).parcela(0).parcela_unario().p1;
                } catch (Exception e) {
                }
                if (idCtx == null) {
                    adicionarErroSemantico(args.get(i).start,
                            "argumento nao pode ser uma expressao para parametro var");
                    continue;
                }
            }
            // Para chamadas de função, os tipos devem ser exatos. Conversão implícita não é
            // permitida.
            if (tipoFornecido != paramEsperado.getTipo()) {
                adicionarErroSemantico(tokenChamada, "incompatibilidade de parametros na chamada de " + subRotina.nome);
                break; // Para o erro na primeira incompatibilidade e evita mensagens duplicadas
            }
        }
    }
}