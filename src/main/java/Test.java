import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.SolidityAnnotatedLexer;
import generated.SolidityAnnotatedParser;
import validation.IdentifierCollector;
import validation.AnnotationChecker;
import validation.ValidationInformation;

class Test{
    public static void main(String[] args){
	    File file = new File(args[0]);
		System.out.println("--- Compiling: "+file.getAbsolutePath());
		if(!file.exists()) {
			System.err.println("  File not found: " + file.getAbsolutePath());
		}else{
			try{
				ErrorListener listener = new ErrorListener();
				CharStream stream = CharStreams.fromFileName(file.getPath());
				SolidityAnnotatedLexer lexer = new SolidityAnnotatedLexer(stream);
				lexer.removeErrorListeners();
				lexer.addErrorListener(listener);
				TokenStream tokens = new CommonTokenStream(lexer);
				SolidityAnnotatedParser parser = new SolidityAnnotatedParser(tokens);
				parser.removeErrorListeners();
				parser.addErrorListener(listener);
				ParseTree result = parser.sourceUnit();
				//CustomSolidityVisitor visitor = new CustomSolidityVisitor(result);
				//visitor.visit(result);

				if(listener.hasErrors()){
					listener.printErrors();
					return;
				}
				
				ValidationInformation infoObj = new ValidationInformation();
				IdentifierCollector col = new IdentifierCollector(infoObj);
				col.visit(result);
				AnnotationChecker checker = new AnnotationChecker(infoObj);
				checker.visit(result);
			}catch(IOException ex){
				System.out.println(ex.toString());
			}



		}

    }

}