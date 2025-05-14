package br.ufscar.dc.compiladores.alguma.sintatico;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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

        CharStream cs = CharStreams.fromFileName(args[0]);
        AlgumaLexer lexer = new AlgumaLexer(cs);

        List<String> saidaTokens = new ArrayList<>();
        boolean erroLexico = false;
        String erroLexicoMsg = "";

        // 1. Realiza análise léxica e armazena tokens e possíveis erros
        Token t;
        while ((t = lexer.nextToken()).getType() != Token.EOF) {
            String nomeToken = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
            String texto = t.getText();
            /*erroLexicoMsg = "Linha " + t.getLine() + ": cadeia literal nao fechada";
            erroLexico = true;*/
            if ("CADEIA_INACABADA".equals(nomeToken)) {
                erroLexicoMsg = "Linha " + t.getLine() + ": cadeia literal nao fechada\nFim da compilacao";
                
                erroLexico = true;
                break;
            }

            if ("COMENTARIO_INACABADO".equals(nomeToken)) {
                erroLexicoMsg = "Linha " + t.getLine() + ": comentario nao fechado\nFim da compilacao";
                erroLexico = true;
                break;
            }

            if ("ERROR".equals(nomeToken)) {
                erroLexicoMsg = "Linha " + t.getLine() + ": " + texto + " - simbolo nao identificado\nFim da compilacao";
                erroLexico = true;
                break;
            }

            if (!nomeToken.equals("WS") && !nomeToken.equals("COMENTARIO")) {
                saidaTokens.add("<'" + texto + "'," + nomeToken + ">");
            }
        }

        // 2. Se houver erro léxico, imprime só ele
        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            if (erroLexico) {
                pw.println(erroLexicoMsg);
                return;
            }

            // 3. Reinicializa lexer/parser
            cs = CharStreams.fromFileName(args[0]);
            lexer = new AlgumaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgumaParser parser = new AlgumaParser(tokens);

            // 4. Adiciona listener de erro sintático
            parser.removeErrorListeners();
            final boolean[] erroSintatico = {false};

            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line,
                                        int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    erroSintatico[0] = true;
                    String textoErro = ((Token) offendingSymbol).getText();
                                            if ("<EOF>".equals(textoErro)) {
                                                textoErro = "EOF";
                                            }
                                            pw.println("Linha " + line + ": erro sintatico proximo a " + textoErro);
                    pw.println("Fim da compilacao");
                    // Interrompe imediatamente com uma exceção
                    throw new RuntimeException("Erro sintático encontrado");
                }
            });

            // 5. Executa o parser
            parser.programa();

            // 6. Se não houve erro sintático, imprime os tokens
            if (!erroSintatico[0]) {
                for (String s : saidaTokens) {
                    pw.println(s);
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de saída.");
        }
    }
}
