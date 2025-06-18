package br.ufscar.dc.compiladores.t5.ger;

import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufscar.dc.compiladores.t5.ger.T5Lexer;
import br.ufscar.dc.compiladores.t5.ger.T5Parser;
import br.ufscar.dc.compiladores.t5.ger.T5Parser.ProgramaContext;

public class Principal {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        T5Lexer lexer = new T5Lexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        T5Parser parser = new T5Parser(tokens);
        ProgramaContext arvore = parser.programa();
        T5Semantico sem = new T5Semantico();
        sem.visitPrograma(arvore);
        if (T5SemanticoUtils.errosSemanticos.isEmpty()) {
            T5GeradorC ger = new T5GeradorC(sem.getTabela());
            ger.visitPrograma(arvore);
            try (PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(ger.getSaida());
            }
        }

    }
}
