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
import validation.TypeChecker;
import validation.ValidationInformation;

class Test{
    public static void main(String[] args){
	    File file = new File(args[0]);
		System.out.println("--- Compiling: "+file.getAbsolutePath());
		if(!file.exists()) {
			System.err.println("  File not found: " + file.getAbsolutePath());
		}else{
			try{
				CharStream stream = CharStreams.fromFileName(file.getPath());
				SolidityAnnotatedLexer lexer = new SolidityAnnotatedLexer(stream);
				TokenStream tokens = new CommonTokenStream(lexer);
				SolidityAnnotatedParser parser = new SolidityAnnotatedParser(tokens);
				ParseTree result = parser.sourceUnit();
				//CustomSolidityVisitor visitor = new CustomSolidityVisitor(result);
				//visitor.visit(result);
				
				ValidationInformation infoObj = new ValidationInformation();
				IdentifierCollector col = new IdentifierCollector(infoObj);
				col.visit(result);
				TypeChecker checker = new TypeChecker(infoObj);
				checker.visit(result);

				
			}catch(IOException ex){
				System.out.println(ex.toString());
			}



		}

    }

}