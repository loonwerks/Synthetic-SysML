/*
 * Minimal bridge from Sireum's generated SysML parser to exact GUMBO spans.
 */

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sireum.hamr.sysml.parser.SysMLv2BaseListener;
import org.sireum.hamr.sysml.parser.SysMLv2Lexer;
import org.sireum.hamr.sysml.parser.SysMLv2Parser;

public final class SysmlGumboSpans {
  private record Span(int start, int endExclusive, String kind) {}

  private static final class SyntaxErrors extends BaseErrorListener {
    private int count = 0;

    @Override
    public void syntaxError(
        Recognizer<?, ?> recognizer,
        Object offendingSymbol,
        int line,
        int charPositionInLine,
        String message,
        RecognitionException exception) {
      count += 1;
      System.err.printf("%d:%d: %s%n", line, charPositionInLine + 1, message);
    }
  }

  private static final class GumboListener extends SysMLv2BaseListener {
    private final List<Span> spans = new ArrayList<>();

    @Override
    public void enterRuleTextualRepresentation(
        SysMLv2Parser.RuleTextualRepresentationContext context) {
      String kind = null;
      if (context.ruleGumboLibrary() != null) {
        kind = "library";
      } else if (context.ruleGumboSubclause() != null) {
        kind = "subclause";
      }
      if (kind != null) {
        spans.add(new Span(
            context.getStart().getStartIndex(),
            context.getStop().getStopIndex() + 1,
            kind));
      }
    }
  }

  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      System.err.println("usage: SysmlGumboSpans <model.sysml>");
      System.exit(64);
    }

    String source = Files.readString(Path.of(args[0]), StandardCharsets.UTF_8);
    SysMLv2Lexer lexer = new SysMLv2Lexer(CharStreams.fromString(source));
    SyntaxErrors errors = new SyntaxErrors();
    lexer.removeErrorListeners();
    lexer.addErrorListener(errors);

    SysMLv2Parser parser = new SysMLv2Parser(new CommonTokenStream(lexer));
    parser.removeErrorListeners();
    parser.addErrorListener(errors);
    SysMLv2Parser.EntryRuleRootNamespaceContext tree =
        parser.entryRuleRootNamespace();
    if (errors.count != 0) {
      System.exit(2);
    }

    GumboListener listener = new GumboListener();
    ParseTreeWalker.DEFAULT.walk(listener, tree);
    listener.spans.sort(Comparator.comparingInt(Span::start));
    for (Span span : listener.spans) {
      System.out.printf(
          "%d\t%d\t%s%n", span.start(), span.endExclusive(), span.kind());
    }
  }
}
