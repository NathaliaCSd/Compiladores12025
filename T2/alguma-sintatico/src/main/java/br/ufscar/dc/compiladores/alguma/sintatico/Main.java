package br.ufscar.dc.compiladores.alguma.sintatico;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String args[]) throws IOException {
        if (args.length < 2) {
            System.err.println("Uso: java -jar <jarfile> <arquivo_entrada> <arquivo_saida>");
            return;
        }

        // Leitura do arquivo de entrada
        CharStream cs = CharStreams.fromFileName(args[0]);
        AlgumaLexer lexer = new AlgumaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {

            // 1. Imprime os tokens reconhecidos
            Token t = null;
            while ((t = lexer.nextToken()).getType() != Token.EOF) {
                String nomeToken = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
                String texto = t.getText();
                //pw.println("<'" + texto + "'," + nomeToken + ">");
            }

            // 2. Reinicializa o CharStream e o lexer, porque ele já foi consumido
            cs = CharStreams.fromFileName(args[0]);
            lexer = new AlgumaLexer(cs);
            tokens = new CommonTokenStream(lexer);
            AlgumaParser parser = new AlgumaParser(tokens);

            // 3. Remove o listener padrão e adiciona um personalizado
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line,
                                        int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    pw.println("Linha " + line + ": erro sintatico proximo a " + ((Token) offendingSymbol).getText());
                }
            });

            // 4. Executa o parser
            parser.programa();
            pw.println("Fim da compilacao");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de saída: " + args[1]);
        }
    }
}
