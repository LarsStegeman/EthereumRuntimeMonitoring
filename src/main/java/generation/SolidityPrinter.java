package generation;

import org.antlr.v4.runtime.TokenStreamRewriter;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationDefinitionContext;
import generated.SolidityAnnotatedParser.AnnotationExpressionContext;
import generated.SolidityAnnotatedParser.SourceUnitContext;

public class SolidityPrinter extends SolidityAnnotatedBaseVisitor<String>{

    private  int currentAnnotation;
    private StringBuilder program;
    private TokenStreamRewriter rewriter;

    public SolidityPrinter(TokenStreamRewriter rewriter){
        program = new StringBuilder();
        this.rewriter = rewriter;
    }

    @Override
    public String visitSourceUnit(SourceUnitContext ctx){
        //System.out.println(ctx.getText());
        visit(ctx.contractDefinition(0));
        return null;
    }

    @Override
    public String visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        //For each annotation we must create a modifier
        String modifier = "modifier annotation" + currentAnnotation + "{";
        String expression = visit(ctx.annotationExpression());
        expression = formatExpression(expression);
        if(ctx.AnnotationKind().toString().equals("inv")){
            modifier+=expression;
            modifier+="_;";
            modifier+=expression;
        }else if(ctx.AnnotationKind().toString().equals("pre")){
            modifier+=expression;
            modifier+="_;";
        }else{
            modifier+="_;";
            modifier+=expression;
        }
        modifier+= "}\n";
        rewriter.insertAfter(ctx.start, modifier);
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