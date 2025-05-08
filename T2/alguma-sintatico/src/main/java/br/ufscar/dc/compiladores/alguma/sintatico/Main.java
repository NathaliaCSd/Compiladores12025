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
        CharStream cs = CharStreams.fromFileName(args[0]);
        AlgumaLexer lexer = new AlgumaLexer(cs);

        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            Token t = null;
            boolean houveErroLexico = false;

            // Verificação de erros léxicos
            while ((t = lexer.nextToken()).getType() != Token.EOF) {
                String nomeToken = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
                String texto = t.getText();
<<<<<<< HEAD
                //pw.println("<'" + texto + "'," + nomeToken + ">");
=======

                if ("COMENTARIO_INACABADO".equals(nomeToken)) {
                    pw.println("Linha " + t.getLine() + ": comentario nao fechado");
                    houveErroLexico = true;
                    break;
                }
                if ("CADEIA_INACABADA".equals(nomeToken)) {
                    pw.println("Linha " + t.getLine() + ": cadeia literal nao fechada");
                    houveErroLexico = true;
                    break;
                }
                if ("ERROR".equals(nomeToken)) {
                    pw.println("Linha " + t.getLine() + ": " + texto + " - simbolo nao identificado");
                    houveErroLexico = true;
                    break;
                }
>>>>>>> 9d471cf (testando casos de erro)
            }

            if (houveErroLexico) {
                pw.println("Fim da compilacao");
                return;
            }

            // Nova leitura para análise sintática
            cs = CharStreams.fromFileName(args[0]);
            lexer = new AlgumaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgumaParser parser = new AlgumaParser(tokens);

            // Listener de erro sintático
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line,
                                        int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
<<<<<<< HEAD
                    pw.println("Linha " + line + ": erro sintatico proximo a " + ((Token) offendingSymbol).getText());
=======
                    String textoErro = ((Token) offendingSymbol).getText();
                    if ("<EOF>".equals(textoErro)) {
                        textoErro = "EOF";
                    }
                    throw new RuntimeException("Linha " + line + ": erro sintatico proximo a " + textoErro);
>>>>>>> 9d471cf (testando casos de erro)
                }
            });
            

<<<<<<< HEAD
            // 4. Executa o parser
            parser.programa();
            pw.println("Fim da compilacao");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de saída: " + args[1]);
        }
=======
            try {
                parser.programa();
                tokens.fill();
                for (Token tokenFinal : tokens.getTokens()) {
                    String nomeToken = AlgumaLexer.VOCABULARY.getDisplayName(tokenFinal.getType());
                    String texto = tokenFinal.getText();
                    if (!nomeToken.equals("WS") && !nomeToken.equals("COMENTARIO")) {
                        pw.println("<'" + texto + "'," + nomeToken + ">");
                    }
                }
                pw.println("Fim da compilacao");
            } catch (RuntimeException e) {
                pw.println(e.getMessage());
                pw.println("Fim da compilacao");
            }
            
>>>>>>> 9d471cf (testando casos de erro)
    }
}
}