package generation;

import org.antlr.v4.runtime.TokenStreamRewriter;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationDefinitionContext;
import generated.SolidityAnnotatedParser.AnnotationExpressionContext;

public class SolidityPrinter extends SolidityAnnotatedBaseVisitor<String>{

    private  int currentAnnotation;
    private TokenStreamRewriter rewriter;

    public SolidityPrinter(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;
    }

    @Override
    public String visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        //For each annotation we must create a modifier
        String modifier = "\n   ";
        modifier +="modifier annotation" + currentAnnotation + "{";
        String expression = visit(ctx.annotationExpression());
        expression = formatExpression(expression);
        if(ctx.AnnotationKind().toString().equals("inv")){
            modifier+="\n   " + expression + "\n    _;\n    " + expression + "\n";
        }else if(ctx.AnnotationKind().toString().equals("pre")){
            modifier+="\n   " + expression + "\n    _;\n";
        }else{
            modifier+="\n    _;\n    " + expression + "\n";
        }
        modifier+= "    }\n";
        rewriter.insertAfter(ctx.stop, modifier);
        currentAnnotation++;
        return null;
    }

    public String visitAnnotationExpression(AnnotationExpressionContext ctx){
        return ctx.getText();
    }

    //The format for expression evaluation, so it can be easily changed for an event.
    public String formatExpression(String exp){
        return "assert(" + exp + ");"; 
    }
}