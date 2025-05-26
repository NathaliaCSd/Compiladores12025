package br.ufscar.dc.compiladores.expr.parser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class Principal {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Uso: java -jar <jarfile> <arquivo_entrada> <arquivo_saida>");
            return;
        }

        String entrada = args[0];
        String saida = args[1];

        // 1) Análise Léxica
        CharStream cs = CharStreams.fromFileName(entrada);
        AlgumaLexer lexer = new AlgumaLexer(cs);

        boolean erroLexico = false;
        String msgLexico = "";
        Token t;
        while ((t = lexer.nextToken()).getType() != Token.EOF) {
            String nome = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
            String txt = t.getText();

            if ("CADEIA_INACABADA".equals(nome)) {
                msgLexico = String.format("Linha %d: cadeia literal nao fechada",
                        t.getLine());
                erroLexico = true;
                break;
            }
            if ("COMENTARIO_INACABADO".equals(nome)) {
                msgLexico = String.format("Linha %d: comentario nao fechado",
                        t.getLine());
                erroLexico = true;
                break;
            }
            if ("ERROR".equals(nome)) {
                msgLexico = String.format("Linha %d: %s - simbolo nao identificado",
                        t.getLine(), txt);
                erroLexico = true;
                break;
            }
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter(saida))) {
            if (erroLexico) {
                pw.println(msgLexico);
                pw.println("Fim da compilacao");
                return;
            }

            // 2) Análise Sintática
            cs = CharStreams.fromFileName(entrada);
            lexer = new AlgumaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AlgumaParser parser = new AlgumaParser(tokens);

            // remove listener padrão e adiciona o nosso
            parser.removeErrorListeners();
            final boolean[] erroSint = { false };
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r,
                        Object offendingSymbol,
                        int line,
                        int charPositionInLine,
                        String msg,
                        RecognitionException e) {
                    String sym = ((Token) offendingSymbol).getText();
                    pw.println("Linha " + line + ": erro sintatico proximo a " + sym);
                }
            });

            AlgumaParser.ProgramaContext arvore = parser.programa();

            if (erroSint[0]) {
                return;
            }

            // 3) Análise Semântica
            AlgumaSemantico visitante = new AlgumaSemantico();
            visitante.visitPrograma(arvore);

            List<String> errosSem = AlgumaSemanticoUtils.errosSemanticos;
            if (!errosSem.isEmpty()) {
                for (String e : errosSem) {
                    pw.println(e);
                }
            }

            // Se não houver erro algum, opcionalmente nada é impresso
            pw.println("Fim da compilacao");
        } catch (IOException ioe) {
            System.err.println("Erro ao escrever no arquivo de saída: " + ioe.getMessage());
        }
    }
}
