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
        T5Semantico as = new T5Semantico();
        as.visitPrograma(arvore);
        T5SemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
        
        if(T5SemanticoUtils.errosSemanticos.isEmpty()) {
            T5GeradorC agc = new T5GeradorC();
            agc.visitPrograma(arvore);
            try(PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.saida.toString());
            }
        }
    }
}
