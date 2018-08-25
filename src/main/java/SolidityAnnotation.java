import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.SolidityAnnotatedLexer;
import generated.SolidityAnnotatedParser;
import generation.AnnotationInformation;
import generation.SolidityPrinter;
import utils.ErrorListener;
import validation.AnnotationChecker;
import validation.IdentifierCollector;
import validation.ValidationInformation;

public class SolidityAnnotation{
	private File file;
	TokenStream tokens;

    public static void main(String[] args){
		if(args.length != 1){
			System.out.println(" Error: program should be called with a solidity file as an argument");
			return;
		}
		File file = new File(args[0]);
		if(!file.exists()) {
			System.err.println("  File not found: " + file.getAbsolutePath());
			return;
		}
		SolidityAnnotation sa = new SolidityAnnotation(file);
		sa.analyseProgram();
	}
	
	public SolidityAnnotation(File file){
		this.file = file;
	}


	public void analyseProgram(){
		//All steps of the execution are called, and execution is halted on error
		ErrorListener listener = new ErrorListener();
		// Parse
		ParseTree tree = parseProgram(listener);
		if(listener.hasErrors() || tree == null){
			listener.printErrors();
			return;
		}

		// Validation
		List<AnnotationInformation> info = validateProgram(tree, listener);
		if(listener.hasErrors()){
			listener.printErrors();
			//return;
		}

		// Generation
		String result = generateProgram(tree, info);
		// Print to file
		printFile(getOutputFileName(file.getName()), result);
	}

	public ParseTree parseProgram(ErrorListener listener){
		System.out.println("--- Parsing: "+file.getAbsolutePath());
		CharStream stream;
		try{
			stream = CharStreams.fromFileName(file.getPath());
		}catch(IOException ex){
			System.out.println("Error when reading file");
			return null;
		}
		SolidityAnnotatedLexer lexer = new SolidityAnnotatedLexer(stream);
		lexer.removeErrorListeners();
		lexer.addErrorListener(listener);
		TokenStream tokens = new CommonTokenStream(lexer);
		this.tokens = tokens;
		SolidityAnnotatedParser parser = new SolidityAnnotatedParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(listener);
		return parser.sourceUnit();
	}

	public List<AnnotationInformation> validateProgram(ParseTree tree, ErrorListener listener){
		ValidationInformation infoObj = new ValidationInformation();
		IdentifierCollector col = new IdentifierCollector(infoObj);
		col.visit(tree);
		AnnotationChecker checker = new AnnotationChecker(infoObj, listener);
		checker.visit(tree);
		return checker.getAnnotationsInformation();
	}

	public String generateProgram(ParseTree tree, List<AnnotationInformation> info){	
		//Generation
		TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
		SolidityPrinter printer = new SolidityPrinter(rewriter, info);
		printer.visit(tree);
		//Rewriter has the added annotations
		return rewriter.getText();
	}
	

	public String getOutputFileName(String original){
		return original.substring(0,original.length()-4)+"_generated.sol";
	}

	public void printFile(String name, String program){
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