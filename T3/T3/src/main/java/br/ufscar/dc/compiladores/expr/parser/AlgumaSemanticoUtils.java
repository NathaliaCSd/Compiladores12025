package br.ufscar.dc.compiladores.expr.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.expr.parser.AlgumaParser.Exp_aritmeticaContext;
import br.ufscar.dc.compiladores.expr.parser.AlgumaParser.Exp_relacionalContext;
import br.ufscar.dc.compiladores.expr.parser.AlgumaParser.ExpressaoContext;
import br.ufscar.dc.compiladores.expr.parser.AlgumaParser.FatorContext;
import br.ufscar.dc.compiladores.expr.parser.AlgumaParser.TermoContext;

public class AlgumaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();

    // Adiciona erro semântico com linha e coluna
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    // Verifica tipo de expressão lógica ou aritmética
    public static TabelaDeSimbolos.TipoAlguma verificarTipo(
            TabelaDeSimbolos tabela,
            ExpressaoContext ctx) {
        // Expressão lógica: se houver operadores lógicos, retorno inválido em semântico
        // aritmético
        // Aqui delega para exp_relacional
        // MEU JAVA NAO ESTAVA ACEITANDO A DECLARACAO "var" ENTAO FIZ UMA DECLARACAO EXPLICITA DE TIPO
        Exp_relacionalContext relCtx = ctx.getRuleContext(Exp_relacionalContext.class, 0);
        if (relCtx != null) {
            return verificarTipo(tabela, relCtx);
        }
        return TabelaDeSimbolos.TipoAlguma.INVALIDO;
    }

    // Verifica tipo de exp_relacional: delega a exp_aritmetica
    public static TabelaDeSimbolos.TipoAlguma verificarTipo(
            TabelaDeSimbolos tabela,
            br.ufscar.dc.compiladores.expr.parser.AlgumaParser.Exp_relacionalContext ctx) {
        return verificarTipo(tabela, ctx.exp_aritmetica(0));
    }

    // Verifica tipo de expressão aritmética (exp_aritmetica)
    public static TabelaDeSimbolos.TipoAlguma verificarTipo(
            TabelaDeSimbolos tabela,
            Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (TermoContext ta : ctx.termo()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                adicionarErroSemantico(ctx.start,
                        "Expressão '" + ctx.getText() + "' contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    // Verifica tipo de termo (termo)
    public static TabelaDeSimbolos.TipoAlguma verificarTipo(
            TabelaDeSimbolos tabela,
            TermoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (FatorContext fa : ctx.fator()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(tabela, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                adicionarErroSemantico(ctx.start,
                        "Termo '" + ctx.getText() + "' contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    // Verifica tipo de fator (fator)
    public static TabelaDeSimbolos.TipoAlguma verificarTipo(
            TabelaDeSimbolos tabela,
            FatorContext ctx) {
        // inteiro
        if (ctx.getToken(br.ufscar.dc.compiladores.expr.parser.AlgumaParser.NUM_INT, 0) != null) {
            return TabelaDeSimbolos.TipoAlguma.INTEIRO;
        }
        // real
        if (ctx.getToken(br.ufscar.dc.compiladores.expr.parser.AlgumaParser.NUM_REAL, 0) != null) {
            return TabelaDeSimbolos.TipoAlguma.REAL;
        }
        // identificador
        if (ctx instanceof AlgumaParser.FatorIdentificadorContext) {
            AlgumaParser.FatorIdentificadorContext sub = (AlgumaParser.FatorIdentificadorContext) ctx;
            String nome = sub.identificador().getText();
            if (!tabela.existe(nome)) {
                adicionarErroSemantico(sub.start,
                        "Variável '" + nome + "' não declarada");
                return TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
            return tabela.verificar(nome);
        }
        // parênteses: busca exp_aritmetica dentro de ctx
        Exp_aritmeticaContext sub = ctx.getRuleContext(
                Exp_aritmeticaContext.class, 0);
        if (sub != null) {
            return verificarTipo(tabela, sub);
        }
        // demais (chamada de função, string, referência) tratados como inválido
        return TabelaDeSimbolos.TipoAlguma.INVALIDO;
    }
}
