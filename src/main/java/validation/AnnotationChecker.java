package validation;


import org.antlr.v4.runtime.tree.ParseTree;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationDefinitionContext;
import generated.SolidityAnnotatedParser.ContractDefinitionContext;
import utils.ErrorListener;


/*  This class checks the following properties
        - Validates if the used identifiers are indeed variables
        - TODO
*/
public class AnnotationChecker extends SolidityAnnotatedBaseVisitor<Void>{
    ValidationInformation info;
    ErrorListener listener;

    public AnnotationChecker(ValidationInformation info, ErrorListener listener){
        System.out.println("AnnotationChecker created");
        this.info = info;
        this.listener = listener;
    }

    public String getNextFunction(ParseTree tree){
        //Find contract definition
        ParseTree contractDef = tree.getParent().getParent();
        if(contractDef instanceof ContractDefinitionContext){
            ContractDefinitionContext contractContext = (ContractDefinitionContext) contractDef;
            for(int i = 0; i< contractContext.contractPart().size();i++){
                if(contractContext.contractPart(i).annotationDefinition() != null && contractContext.contractPart(i).annotationDefinition().equals(tree)){
                    for(int j = i; j< contractContext.contractPart().size();j++){
                        if(contractContext.contractPart(j).functionDefinition() != null){
                            return contractContext.contractPart(j).functionDefinition().identifier().getText();
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Void visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        System.out.println("Annotation found");
        System.out.println(ctx.getText());
        //Create TypeChecker with ValidationInformation object
        //Each annotation will report its own errors and continue.

        // If annotationType is pre or post get funcion name it references.
        String functionReference = null;
        if(!ctx.AnnotationKind().toString().equals("inv")){
            functionReference = getNextFunction(ctx);
        }

        TypeChecker checker = new TypeChecker(info, functionReference, listener);
        SolidityType type = checker.visit(ctx.annotationExpression());
        if(type != SolidityType.BOOL){
            //Log error
            listener.validateError(ctx,"Expected type 'bool' at %s but is %s", ctx.getText(), type);;
        }
       
        return null;
    }


}