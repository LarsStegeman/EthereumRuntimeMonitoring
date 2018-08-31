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
import generated.SolidityAnnotatedParser.PrimaryAnnotationExpressionContext;
import validation.SolidityType;
import validation.SolidityVariable;

public class SolidityPrinter extends SolidityAnnotatedBaseVisitor<String>{

    private TokenStreamRewriter rewriter;
    private List<AnnotationInformation> info;

    //Current annotation state variables
    AnnotationInformation annotationInfo;
    String annotationString;
    int expressionNumber;


    public SolidityPrinter(TokenStreamRewriter rewriter, List<AnnotationInformation> info){
        this.rewriter = rewriter;
        this.info = info;
    }

    @Override
    public String visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        //Clear state
        annotationInfo = findAnnotationInfo(ctx);
        annotationString = new String();
        expressionNumber = 0;
        //For each annotation create a function
        String modifier = "\n   ";


        String annotationParameters = new String();
        if(!annotationInfo.getType().equals("inv")){
            for(SolidityVariable var: annotationInfo.getArgumentVariables()){
                annotationParameters +=  ", " + var.getTypeString() + " " + var.name; 
            }
            annotationParameters = annotationParameters.substring(2);
        }
        String expression = visit(ctx.annotationExpression());
        expression = formatExpression(expression);

        modifier +="function " + annotationInfo.getName() + "(" + annotationParameters + ") private{ \n";
        modifier += annotationString;
        modifier += "   " + expression + "\n";
        modifier += "    }\n";
        rewriter.insertAfter(ctx.stop, modifier);
        return null;
    }

    @Override
    public String visitAnnotationExpression(AnnotationExpressionContext ctx){
        String result = new String();
        if(ctx.primaryAnnotationExpression() != null){
            result = visit(ctx.primaryAnnotationExpression());
        }else if(ctx.identifier().size() == 2){
            //Forall/exist expression
            result = printAnnotationLoop(ctx);
        }else if(ctx.annotationExpression().size() == 1){
            // case of ! 'expr'
            if(ctx.getStart().getText().equals("!")){
                result = "! " + visit(ctx.annotationExpression(0));
            }else{
                result =  "(" + visit(ctx.annotationExpression(0)) + " )";
            }
        }else{
            // First visit children and get their type
            String exp1 = this.visit(ctx.annotationExpression(0));
            String exp2 = this.visit(ctx.annotationExpression(1));
            //Different cases for annotationExpression
            if(ctx.booleanOp() != null){
                if(ctx.booleanOp().getText().equals("->")){
                    result = "!" + exp1 + "||" + exp2; 
                }else{
                    result = exp1 + ctx.booleanOp().getText() + exp2;
                }
            }else if(ctx.compareOp() != null){
                result = exp1 + ctx.compareOp().getText() + exp2;
            }else if(ctx.integerOpBoolean() != null){
                result = exp1 + ctx.integerOpBoolean().getText() + exp2;
            }else if(ctx.integerOpInteger() != null){
                result = exp1 + ctx.integerOpInteger().getText() + exp2;
            }
        }
        return result;
    }

    @Override
    public String visitPrimaryAnnotationExpression(PrimaryAnnotationExpressionContext ctx){
        if(ctx.primaryAnnotationExpression() != null && ctx.primaryExpression() == null && ctx.identifier() == null){
            PrimaryAnnotationExpressionContext current = ctx.primaryAnnotationExpression();
            while(current.primaryAnnotationExpression() != null){
                current = current.primaryAnnotationExpression();
            }
            //Get the base definition and add _old for the identifier, then add the rest of the expression.
            return current.getText() + "_old" + ctx.primaryAnnotationExpression().getText().substring(current.getText().length());
        }
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
        List<AnnotationInformation> allAnnotations = getAllAnnotations(functionNameOriginal);
        String storeOldVariables = new String("");
        String addBeforeBody = new String("");
        String addAfterBody = new String("");
        for(AnnotationInformation current: allAnnotations){
            String annotationParameters = new String();
            for(SolidityVariable var: current.getArgumentVariables()){
                annotationParameters +=  ", "  + var.name; 
            }
            if(annotationParameters.length() > 1){
                annotationParameters = annotationParameters.substring(2);
            }
            String temp =  "        " + current.getName() + "("+ annotationParameters+");\n";
            if(current.getType().equals("inv")){
                addBeforeBody += temp;
                addAfterBody += temp;
            }else if(current.getType().equals("pre")){
                addBeforeBody += temp;
            }else{
                addAfterBody += temp;
            }

            // Copy all old variables
            for(SolidityVariable var: current.getArgumentVariables()){
                if(var.name.endsWith("_old")){
                    if(var.type == SolidityType.STRUCT){
                        storeOldVariables += "\n        " + var.getTypeString() + " memory " + var.name + " = " + var.name.substring(0, var.name.length()-4) + ";";
                    }else if(var.type == SolidityType.ARRAY){
                        storeOldVariables += "\n        " + var.getTypeString() + "[] memory " + var.name + " = " + var.name.substring(0, var.name.length()-4) + ";";
                    }else{
                        storeOldVariables += "\n        " + var.getTypeString() + " " + var.name + " = " + var.name.substring(0, var.name.length()-4) + ";";
                    }
                }
            }
        }

        if(hasReturnParameters){
            newFunction+= storeOldVariables;
            newFunction+= addBeforeBody;
            newFunction+= "\n        " + functionReturn  + " = "+ functionNameOriginal+ "_body("+ functionArguments + ");\n";
            newFunction+= addAfterBody;
            newFunction+= "    return result;\n";
            newFunction+= "    }\n    ";    
        }else{
            newFunction+= storeOldVariables;
            newFunction+= addBeforeBody;
            newFunction+= "\n        " + functionNameOriginal+ "_body("+ functionArguments + ");\n";
            newFunction+= addAfterBody;
            newFunction+= "    }\n    "; 
        }

        //Find correct token to add the extra function
        Token tkn = ctx.start;
        rewriter.insertBefore(tkn, newFunction);
        rewriter.replace(ctx.identifier().start, functionNameOriginal + "_body");
        rewriter.replace(ctx.modifierList().start,ctx.modifierList().stop, "private");
        return null;
    }

    public String printAnnotationLoop(AnnotationExpressionContext ctx){
        String loop = new String();
        String expressionBoolean = "expression" + expressionNumber;
        expressionNumber++;

        //Determine if //exists or //forall
        if(ctx.getText().startsWith("\\forall")){
            loop+= "        bool " + expressionBoolean + "= true;\n";
            loop+= "        for(uint256 i; i>0 && i<" + ctx.identifier(1).getText() + ".length &&" + expressionBoolean+";i++){\n";
            loop+= "            " + expressionBoolean + "=" + visit(ctx.annotationExpression(0)) + ";\n"; 
            loop+= "    }\n";
        }else{
            loop+= "        bool " + expressionBoolean + "= false;\n";
            loop+= "        for(uint256 i; i>0 && i<" + ctx.identifier(1).getText() + ".length && !" + expressionBoolean +";i++){\n";
            loop+= "            " + expressionBoolean + "= ( " + visit(ctx.annotationExpression(0)) + ");\n"; 
            loop+= "    }\n";
        }
        //Add the extra code to the annotation
        annotationString += loop;
        return expressionBoolean;
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

    public List<AnnotationInformation> getAllAnnotations(String functionName){
        List<AnnotationInformation> modifiers = new ArrayList<>();
        for(AnnotationInformation x: info){
            if(x.getFunction() == null || x.getFunction().equals(functionName)){
                modifiers.add(x);
            }
        }
        return modifiers;
    }
}