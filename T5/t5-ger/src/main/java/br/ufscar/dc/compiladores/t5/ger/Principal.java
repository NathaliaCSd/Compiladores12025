package br.ufscar.dc.compiladores.t5.ger;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Principal {
    public static void main(String[] args) throws IOException {

        try (PrintWriter pw = new PrintWriter(args[1])) {
            CharStream cs = CharStreams.fromFileName(args[0]);

            T5Lexer lexer = new T5Lexer(cs);
            //criado uma lista para armazenar os possiveis erros 
            List<String> erros = new ArrayList<>();
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?,?> r, Object o,
                                        int line, int charPos, String msg, RecognitionException e) {
                    erros.add(String.format("Linha %d:%d %s", line, charPos, msg));
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            T5Parser parser = new T5Parser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?,?> r, Object o,
                                        int line, int charPos, String msg, RecognitionException e) {
                    erros.add(String.format("Linha %d:%d %s", line, charPos, msg));
                }
            });

            ParseTree arvore = parser.programa();

            T5Semantico sem = new T5Semantico();
            sem.visit(arvore);
            erros.addAll(T5SemanticoUtils.errosSemanticos);

            //se tiver algum erro, eh printado no arquivo
            if (!erros.isEmpty()) {
                erros.forEach(pw::println);
                pw.println("Fim da compilacao");
                return;
            }

            T5GeradorC ger = new T5GeradorC(sem.pilhaDeTabelas);
            ger.visit(arvore);
            pw.print(ger.getSaida());
        }
    }
}
