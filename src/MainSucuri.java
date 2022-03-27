import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MainSucuri {
    public static void main(String[] args) {
        try {
            grammarSucuriLexer lexer;
            grammarSucuriParser parser;

            lexer = new grammarSucuriLexer(CharStreams.fromFileName("input.suc"));

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            parser = new grammarSucuriParser(tokenStream);

            parser.prog();

            System.out.println("Compilation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}