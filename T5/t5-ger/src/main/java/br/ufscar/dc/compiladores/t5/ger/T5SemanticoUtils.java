package br.ufscar.dc.compiladores.t5.ger;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.t5.ger.TabelaDeSimbolos.TipoT5;

public class T5SemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static boolean ehTipoBasico(String tipoVar) {
        return tipoVar.equals("literal") ||
               tipoVar.equals("inteiro") ||
               tipoVar.equals("real")    ||
               tipoVar.equals("registro")    ||
               tipoVar.equals("logico");
    }

    public static boolean ehTipoNumeral(TipoT5 a, TipoT5 b) {
        return (a == TipoT5.INTEIRO && b == TipoT5.REAL) ||
               (a == TipoT5.REAL    && b == TipoT5.INTEIRO);
    }

    public static boolean ehTipoInteiroEmReal(TipoT5 a, TipoT5 b) {
        return (a == TipoT5.REAL && b == TipoT5.INTEIRO);
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.ExpressaoContext ctx) {
        TipoT5 ret = null;
        for (var tl : ctx.termo_logico()) {
            TipoT5 aux = verificarTipo(pilhaDeTabelas, tl);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TipoT5.INVALIDO) {
                ret = TipoT5.INVALIDO;
            }
        }
        return ret;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Termo_logicoContext ctx) {
        TipoT5 ret = null;
        for (var fl : ctx.fator_logico()) {
            TipoT5 aux = verificarTipo(pilhaDeTabelas, fl);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TipoT5.INVALIDO) {
                ret = TipoT5.INVALIDO;
            }
        }
        return ret;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Fator_logicoContext ctx) {
        return verificarTipo(pilhaDeTabelas, ctx.parcela_logica());
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Parcela_logicaContext ctx) {
        if (ctx.pl1 != null) {
            return TipoT5.LOGICO;
        } else {
            return verificarTipo(pilhaDeTabelas, ctx.pl2);
        }
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas,
                                   T5Parser.ExpressaoRelacionalContext ctx) {
    if (!ctx.op_logico().isEmpty()) {
        return TipoT5.LOGICO;
    } else {
        return verificarTipo(pilhaDeTabelas, ctx.termoRelacional(0));
    }
}

public static TipoT5 verificarTipo(Escopos pilhaDeTabelas,
                                   T5Parser.TermoRelacionalContext ctx) {
    if (ctx.expressaoRelacional() != null) {
        return verificarTipo(pilhaDeTabelas, ctx.expressaoRelacional());
    }
    return TipoT5.LOGICO;
}

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.ExpressaoAritmeticaContext ctx) {
        TipoT5 tipo = null;
        for (var ta : ctx.termoAritmetico()) {
            TipoT5 aux = verificarTipo(pilhaDeTabelas, ta);
            if (tipo == null) {
                tipo = aux;
            } else if (tipo != aux && aux != TipoT5.INVALIDO) {
                if (ehTipoNumeral(tipo, aux)) {
                    tipo = TipoT5.REAL;
                }
                else if ((tipo == TipoT5.LITERAL && aux != TipoT5.LITERAL) ||
                         (aux == TipoT5.LITERAL && tipo != TipoT5.LITERAL)) {
                    tipo = TipoT5.INVALIDO;
                }
                else if (tipo == TipoT5.LITERAL && aux == TipoT5.LITERAL) {
                    tipo = TipoT5.LITERAL;
                }
                else if (tipo == aux) {
                    // mantém “tipo”
                } else {
                    tipo = TipoT5.INVALIDO;
                }
            }
        }
        return tipo;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.TermoAritmeticoContext ctx) {
        TipoT5 tipo = null;
        for (var fa : ctx.fatorAritmetico()) {
            TipoT5 aux = verificarTipo(pilhaDeTabelas, fa);
            if (tipo == null) {
                tipo = aux;
            } else if (tipo != aux && aux != TipoT5.INVALIDO) {
                if (ehTipoNumeral(tipo, aux)) {
                    tipo = TipoT5.REAL;
                } else if ((tipo == TipoT5.LITERAL && aux != TipoT5.LITERAL) ||
                           (aux == TipoT5.LITERAL && tipo != TipoT5.LITERAL)) {
                    tipo = TipoT5.INVALIDO;
                } else if (tipo == TipoT5.LITERAL && aux == TipoT5.LITERAL) {
                    tipo = TipoT5.LITERAL;
                } else if (tipo == aux) {
                    // mantém "tipo"
                } else {
                    tipo = TipoT5.INVALIDO;
                }
            }
        }
        return tipo;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.FatorAritmeticoContext ctx) {
        TipoT5 tipo = null;
        for (var pa : ctx.parcela()) {
            TipoT5 aux = verificarTipo(pilhaDeTabelas, pa);
            if (tipo == null) {
                tipo = aux;
            } else if (tipo != aux && aux != TipoT5.INVALIDO) {
                if (ehTipoNumeral(tipo, aux)) {
                    tipo = TipoT5.REAL;
                } else if ((tipo == TipoT5.LITERAL && aux != TipoT5.LITERAL) ||
                           (aux == TipoT5.LITERAL && tipo != TipoT5.LITERAL)) {
                    tipo = TipoT5.INVALIDO;
                } else if (tipo == TipoT5.LITERAL && aux == TipoT5.LITERAL) {
                    tipo = TipoT5.LITERAL;
                } else if (tipo == aux) {
                    // mantém "tipo"
                } else {
                    tipo = TipoT5.INVALIDO;
                }
            }
        }
        return tipo;
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.ParcelaContext ctx) {
        if (ctx.parcela_unario() != null) {
            return verificarTipo(pilhaDeTabelas, ctx.parcela_unario());
        } else {
            return verificarTipo(pilhaDeTabelas, ctx.parcela_nao_unario());
        }
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Parcela_nao_unarioContext ctx) {
        if (ctx.pn1 != null) { // &identificador (referência)
            return verificarTipo(pilhaDeTabelas.obterEscopoAtual(), ctx.pn1.getText());
        } else { // pn2 = CADEIA
            return TipoT5.LITERAL;
        }
    }

    public static TipoT5 verificarTipo(Escopos pilhaDeTabelas, T5Parser.Parcela_unarioContext ctx) {
        // p1 = identificador
        if (ctx.p1 != null) {
            String nomeId = ctx.p1.getText();
            for (TabelaDeSimbolos esc : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (esc.existe(nomeId)) {
                    return verificarTipo(esc, nomeId);
                }
            }
            return TipoT5.INVALIDO;
        }
        // p2 = chamada de funcao; 
        if (ctx.p2 != null) {
            return TipoT5.REAL;
        }
        // p3 = NUM_INT
        if (ctx.p3 != null) {
            return TipoT5.INTEIRO;
        }
        // p4 = NUM_REAL
        if (ctx.p4 != null) {
            return TipoT5.REAL;
        }
        // p5 = '(' expressao ')'
        return verificarTipo(pilhaDeTabelas, ctx.p5);
    }

    public static TipoT5 verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }

    
}