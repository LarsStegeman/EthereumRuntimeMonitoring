package generation;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationDefinitionContext;
import generated.SolidityAnnotatedParser.AnnotationExpressionContext;
import generated.SolidityAnnotatedParser.FunctionDefinitionContext;

public class SolidityPrinter extends SolidityAnnotatedBaseVisitor<String>{

    private TokenStreamRewriter rewriter;
    private List<AnnotationInformation> info;


    public SolidityPrinter(TokenStreamRewriter rewriter, List<AnnotationInformation> info){
        this.rewriter = rewriter;
        this.info = info;
    }

    @Override
    public String visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        //For each annotation create a modifier
        String modifier = "\n   ";

        AnnotationInformation current = findAnnotationInfo(ctx);
        modifier +="modifier " + current.getName() + "{";
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
        return null;
    }

    @Override
    public String visitAnnotationExpression(AnnotationExpressionContext ctx){
        return ctx.getText();
    }

    public String visitFunctionDefinition(FunctionDefinitionContext ctx){
        // Add correct modifiers to the function, all invariants and post and pre conditions
        String functionName = ctx.identifier().getText();
        List<String> allModifiers = getAllModifiers(functionName);
        String result = new String(" ");
        for(String current: allModifiers){
            result += current + " ";
        }
        //Find correct token to add them
        Token tkn = ctx.modifierList().stop;
        rewriter.insertAfter(tkn, result);
        return null;
    }

    //The format for expression evaluation, so it can be easily changed for an event.
    public String formatExpression(String exp){
        return "assert(" + exp + ");"; 
    }

    public AnnotationInformation findAnnotationInfo(ParserRuleContext ctx){
        for(AnnotationInformation current : info){
            if(current.getNode() == ctx){
                return current;
            }
        }
        return null;
    }

    public List<String> getAllModifiers(String functionName){
        List<String> modifiers = new ArrayList<>();
        for(AnnotationInformation x: info){
            if(x.getFunction() == null || x.getFunction().equals(functionName)){
                modifiers.add(x.getName());
            }
        }
        return modifiers;
    }
}