package br.ufscar.dc.compiladores.t5.ger;

import java.util.HashMap;
import java.util.Map;

//classe tabela de simbolos disponibilizada pelo professor no github da disciplina 

public class TabelaDeSimbolos {
    public enum TipoT5 {
        INTEIRO,
        REAL,
        LITERAL,
        INVALIDO, 
        LOGICO,
        REGISTRO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoT5 tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoT5 tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoT5 tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoT5 verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}