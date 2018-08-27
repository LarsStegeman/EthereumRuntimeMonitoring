package generation;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationDefinitionContext;
import generated.SolidityAnnotatedParser.AnnotationExpressionContext;
import generated.SolidityAnnotatedParser.FunctionDefinitionContext;
import generated.SolidityAnnotatedParser.ParameterContext;

public class SolidityPrinter extends SolidityAnnotatedBaseVisitor<String>{

    private TokenStreamRewriter rewriter;
    private List<AnnotationInformation> info;


    public SolidityPrinter(TokenStreamRewriter rewriter, List<AnnotationInformation> info){
        this.rewriter = rewriter;
        this.info = info;
    }

    @Override
    public String visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        //For each annotation create a function
        String modifier = "\n   ";

        AnnotationInformation current = findAnnotationInfo(ctx);
        String annotationParameters = new String();
        if(!current.getType().equals("inv")){
            //annotationParameters += 
        }
        modifier +="function " + current.getName() + "() private{ \n";
        String expression = visit(ctx.annotationExpression());
        expression = formatExpression(expression);
        modifier += "   " + expression + "\n";
        modifier+= "    }\n";
        rewriter.insertAfter(ctx.stop, modifier);
        return null;
    }

    @Override
    public String visitAnnotationExpression(AnnotationExpressionContext ctx){
        return ctx.getText();
    }

    public String visitFunctionDefinition(FunctionDefinitionContext ctx){
        // For each function:
        // - Rename original function to functionName_body
        // - Create function that calls functionName_body
        // - Add annotations before and after to new funcion
        // - Pass through all variables
        String functionNameOriginal = ctx.identifier().getText();
        String newFunction = rewriter.getText(new Interval(ctx.start.getTokenIndex(), ctx.block().start.getTokenIndex()));

        //Format function arguments
        String functionArguments = new String();
        for(ParameterContext t : ctx.parameterList().parameter()){
            functionArguments +=  ", " +  t.identifier().getText();
        }
        if(functionArguments.length() > 0){
            functionArguments = functionArguments.substring(2);
        }

        //Format function return parameters
        String functionReturn = new String();
        boolean hasReturnParameters = false;
        if(ctx.returnParameters() != null){
            hasReturnParameters = true;
            for(ParameterContext t : ctx.returnParameters().parameterList().parameter()){
                functionReturn+= ", " + t.typeName().getText();
            }
            functionReturn = functionReturn.substring(2);
        }

        //Store \old parameters and pass on function arguments


        if(hasReturnParameters){
            newFunction+= "\n        " + functionReturn  + " = "+ functionNameOriginal+ "_body("+ functionArguments + ");";
            newFunction+= "\n    return result;\n    ";
            newFunction+= "\n    }\n    ";    
        }else{
            newFunction+= "\n        " + functionNameOriginal+ "_body("+ functionArguments + ");";
            newFunction+= "\n    }\n    "; 
        }

        List<String> allAnnotations = getAllAnnotations(functionNameOriginal);
        //Find correct token to add the extra function
        Token tkn = ctx.start;
        rewriter.insertBefore(tkn, newFunction);
        rewriter.replace(ctx.identifier().start, functionNameOriginal + "_body");
        rewriter.replace(ctx.modifierList().start,ctx.modifierList().stop, "private");
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

    public List<String> getAllAnnotations(String functionName){
        List<String> modifiers = new ArrayList<>();
        for(AnnotationInformation x: info){
            if(x.getFunction() == null || x.getFunction().equals(functionName)){
                modifiers.add(x.getName());
            }
        }
        return modifiers;
    }
}