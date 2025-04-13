package br.ufscar.dc.compiladores.t1;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {
    public static void main(String args[]) {
        // args[0] = arquivo de entrada
        // args[1] = arquivo de saída
        try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            t1Jander lex = new t1Jander(cs);

            // escreve a saída no segundo argumento
            try (PrintWriter pw = new PrintWriter(args[1])) {
                Token t = null;
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    String nomeToken = t1Jander.VOCABULARY.getDisplayName(t.getType());
                    String texto = t.getText();

                    if (!nomeToken.equals("WS") && !nomeToken.equals("COMENTARIO")) {
                        pw.println("<'" + texto + "'','" + nomeToken + "''>");
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de entrada: " + args[0]);
        }
    }
}
