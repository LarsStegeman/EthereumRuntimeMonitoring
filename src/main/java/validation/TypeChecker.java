package validation;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationExpressionContext;
import generated.SolidityAnnotatedParser.IdentifierContext;
import generated.SolidityAnnotatedParser.PrimaryExpressionContext;

public class TypeChecker extends SolidityAnnotatedBaseVisitor<String>{
  
    ValidationInformation vi;
	private List<String> errors;

    public TypeChecker(ValidationInformation info){
        this.vi = info;
        errors = new ArrayList<>();
    }

    @Override
    public String visitAnnotationExpression(AnnotationExpressionContext ctx){
        String type = null;
        //Base Case -- get the type;
        if(ctx.primaryExpression() != null){
            type =this.visit(ctx.primaryExpression());
        }else if(ctx.identifier() != null){
            // case of old keyword
            type =this.visit(ctx.identifier());
        }else if(ctx.annotationExpression().size() == 1){
            String type1 =  this.visit(ctx.annotationExpression(0));
            // case of ! 'expr'
            if(ctx.getStart().getText().equals("!")){
                if(!"bool".equals(type1)){
                    addError(ctx, "Expected type 'bool' at %s but is %s", ctx.getText(), type1);                
                }
                type = "bool";
            }else{
                // case of nesting
                type = type1;
            }   
        }else{
            // First visit children and get their type
            String type1 = this.visit(ctx.annotationExpression(0));
            String type2 = this.visit(ctx.annotationExpression(1));
            //Different cases for annotationExpression
            if(ctx.booleanOp() != null){
                if(!"bool".equals(type1) || !"bool".equals(type2)){
                    addError(ctx, "Expected type 'bool', 'bool' at %s but is %s, %s", ctx.getText(), type1, type2); 
                }
                type = "bool";
            }else if(ctx.compareOp() != null){
                if(type1 == null || !type1.equals(type2) ){
                    addError(ctx, "Expected type to match at %s but is %s, %s", ctx.getText(), type1, type2); 
                }
                type = "bool";
            }else if(ctx.integerOpBoolean() != null){
                if(!"uint256".equals(type1) || !"uint256".equals(type2)){
                    addError(ctx, "Expected types to be integers at %s but is %s, %s", ctx.getText(), type1, type2); 
                }
                type = "bool";
            }else if(ctx.integerOpInteger() != null){
                if(!"uint256".equals(type1) || !"uint256".equals(type2)){
                    addError(ctx, "Expected types to be integers at %s but is %s, %s", ctx.getText(), type1, type2); 
                }
                type = "uint256";
            }
        }
        return type;
    }

    @Override
    public String visitPrimaryExpression(PrimaryExpressionContext ctx){
        return visitChildren(ctx);
    }

    @Override
    public String visitIdentifier(IdentifierContext ctx){
        SolidityVariable var = vi.getIdentifier(ctx.getText());
        if(var != null){
            return var.type;
        }else{
            addError(ctx, "Identifier %s in annotation not defined as variable", ctx.getText());
            return  null;
        }
    }


    //Error handling
	/** Indicates if any errors were encountered in this tree listener. */
	public boolean hasErrors() {
		return !getErrors().isEmpty();
	}

	/** Returns the list of errors collected in this tree listener. */
	public List<String> getErrors() {
		return this.errors;
    }

    private void addError(Token token, String message, Object... args) {
		int line = token.getLine();
		int column = token.getCharPositionInLine();
		message = String.format(message, args);
		message = String.format("Line %d:%d - %s", line, column, message);
		this.errors.add(message);
    }
    
    private void addError(ParserRuleContext node, String message, Object... args) {
        addError(node.getStart(), message, args);
    }



}