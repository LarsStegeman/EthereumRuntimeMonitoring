package validation;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationDefinitionContext;


/*  This class checks the following properties
        - Validates if the used identifiers are indeed variables
        - TODO
*/
public class AnnotationChecker extends SolidityAnnotatedBaseVisitor<Void>{
    ValidationInformation info;

    public AnnotationChecker(ValidationInformation info){
        System.out.println("AnnotationChecker created");
        this.info = info;
    }

    @Override
    public Void visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        System.out.println("Annotation found");
        System.out.println(ctx.getText());
        //Create IdentifierChecker with ValidationInformation object
        TypeChecker checker = new TypeChecker(info);
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