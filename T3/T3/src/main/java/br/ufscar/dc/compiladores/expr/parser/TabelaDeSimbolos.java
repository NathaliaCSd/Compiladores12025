package br.ufscar.dc.compiladores.expr.parser;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum TipoAlguma {
        INTEIRO,
        inteiro,
        REAL,
        real,
        LITERAL,
        literal,
        LOGICO,
        logico,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoAlguma tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoAlguma tipo) {
        tabela.put(nome.toLowerCase(), new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome.toLowerCase());
    }
    
    public TipoAlguma verificar(String nome) {
    EntradaTabelaDeSimbolos entrada = tabela.get(nome.toLowerCase());
    if (entrada != null) {
        return entrada.tipo;
    }
    return TipoAlguma.INVALIDO;
}

}