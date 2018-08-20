import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.SolidityAnnotatedLexer;
import generated.SolidityAnnotatedParser;
import generation.SolidityPrinter;
import validation.AnnotationChecker;
import validation.IdentifierCollector;
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
				TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
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
				//Generation
				SolidityPrinter printer = new SolidityPrinter(rewriter);
				printer.visit(result);
				//Rewriter has the added annotations
				String res = rewriter.getText();
				printFile(getOutputFileName(file.getName()), res);
			}catch(IOException ex){
				System.out.println(ex.toString());
			}



		}

	}
	

	public static String getOutputFileName(String original){
		return original.substring(0,original.length()-4)+"_generated.sol";
	}

	public static void printFile(String name, String program){
		try{
			File target = new File(name);
			PrintWriter writer = new PrintWriter(target);
			writer.write(program);
			writer.close();
		}catch(FileNotFoundException ex){
			System.out.println(ex.toString());
		}


	}

}