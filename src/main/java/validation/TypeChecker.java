package validation;

import org.antlr.v4.runtime.tree.ParseTree;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationDefinitionContext;
import generated.SolidityAnnotatedParser.ContractPartContext;


/*  This class checks the following properties
        - Validates if the used identifiers are indeed variables
        - TODO
*/
public class TypeChecker extends SolidityAnnotatedBaseVisitor<Void>{
    ValidationInformation info;

    public TypeChecker(ValidationInformation info){
        System.out.println("TypeChecker created");
        this.info = info;
    }

    @Override
    public Void visitContractPart(ContractPartContext ctx){
        //Only visit annotationDefinitions
        for(ParseTree i : ctx.children ){
            if( i instanceof AnnotationDefinitionContext){
                visit(i);
            }
        }
        return null;
    }

    @Override
    public Void visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        System.out.println("Annotation found");
        System.out.println(ctx.getText());
        //Check identifiers
        IdentifierChecker checker = new IdentifierChecker(info);
        String type = checker.visit(ctx.annotationExpression());
        if(!type.equals("bool")){
            //Log error
            System.out.println("Error annotation not of type boolean but is: " + type);
        }

        //Check for additional errors
        if(checker.hasErrors()){
            for (String error : checker.getErrors()) {
                System.out.println(error);
            }
        }
        return null;
    }


}