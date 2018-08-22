package utils;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

/** Antlr error listener to collect errors rather than send them to stderr. */
public class ErrorListener extends BaseErrorListener {
	/** Errors collected by the listener. */
	private final List<String> errors = new ArrayList<>();

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		this.errors.add(String.format("line %d:%d - %s", line,
				charPositionInLine,
				msg));
	}

	public void validateError(ParserRuleContext node, String message, Object... args){
		addError(node.getStart(), message, args);
	}

	/** Indicates if the listener has collected any errors. */
	public boolean hasErrors() {
		return !this.errors.isEmpty();
	}

	/** Returns the (possibly empty) list of errors collected by the listener. */
	public List<String> getErrors() {
		return this.errors;
	}

	public void printErrors(){
		for (String error : getErrors()) {
			System.out.println(error);
		}
	}

    private void addError(Token token, String message, Object... args) {
		int line = token.getLine();
		int column = token.getCharPositionInLine();
		message = String.format(message, args);
		message = String.format("Line %d:%d - %s", line, column, message);
		this.errors.add(message);
    }
    
}