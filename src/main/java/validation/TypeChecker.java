package validation;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationExpressionContext;
import generated.SolidityAnnotatedParser.IdentifierContext;
import generated.SolidityAnnotatedParser.PrimaryAnnotationExpressionContext;
import generated.SolidityAnnotatedParser.PrimaryExpressionContext;

public class TypeChecker extends SolidityAnnotatedBaseVisitor<SolidityType>{
  
    ValidationInformation vi;
    private String functionReference;
	private List<String> errors;

    public TypeChecker(ValidationInformation info, String functionReference){
        this.vi = info;
        this.functionReference = functionReference;
        errors = new ArrayList<>();
    }

    @Override
    public SolidityType visitAnnotationExpression(AnnotationExpressionContext ctx){
        SolidityType type = null;
        //Base Case -- get the type;
        if(ctx.primaryAnnotationExpression() != null){
            type =this.visit(ctx.primaryAnnotationExpression());
        }else if(ctx.identifier() != null){
            // case of old keyword
            type =this.visit(ctx.identifier());
        }else if(ctx.annotationExpression().size() == 1){
            SolidityType type1 =  this.visit(ctx.annotationExpression(0));
            // case of ! 'expr'
            if(ctx.getStart().getText().equals("!")){
                if(type1 != SolidityType.BOOL){
                    addError(ctx, "Expected type 'bool' at %s but is %s", ctx.getText(), type1);                
                }
                type = SolidityType.BOOL;
            }else{
                // case of nesting
                type = type1;
            }   
        }else{
            // First visit children and get their type
            SolidityType type1 = this.visit(ctx.annotationExpression(0));
            SolidityType type2 = this.visit(ctx.annotationExpression(1));
            //Different cases for annotationExpression
            if(ctx.booleanOp() != null){
                if(type1 != SolidityType.BOOL || type2 !=SolidityType.BOOL){
                    addError(ctx, "Expected type 'bool', 'bool' at %s but is %s, %s", ctx.getText(), type1, type2); 
                }
                type = SolidityType.BOOL;
            }else if(ctx.compareOp() != null){
                if(type1 == null || type1 != type2 ){
                    addError(ctx, "Expected type to match at %s but is %s, %s", ctx.getText(), type1, type2); 
                }
                type = SolidityType.BOOL;
            }else if(ctx.integerOpBoolean() != null){
                if(type1 != SolidityType.INTEGER || type2!=SolidityType.INTEGER){
                    addError(ctx, "Expected types to be integers at %s but is %s, %s", ctx.getText(), type1, type2); 
                }
                type = SolidityType.BOOL;
            }else if(ctx.integerOpInteger() != null){
                if(type1 != SolidityType.INTEGER || type2!=SolidityType.INTEGER){
                    addError(ctx, "Expected types to be integers at %s but is %s, %s", ctx.getText(), type1, type2); 
                }
                type = SolidityType.INTEGER;
            }
        }
        return type;
    }

    @Override
    public SolidityType visitPrimaryAnnotationExpression(PrimaryAnnotationExpressionContext ctx){
        SolidityType result = SolidityType.UNDEFINED;
        // Base case a primary expression
        if(ctx.primaryExpression() != null && ctx.primaryAnnotationExpression() == null){
            result = visit(ctx.primaryExpression());
        }else if(ctx.primaryAnnotationExpression() != null && ctx.primaryExpression() == null && ctx.identifier() == null){
            result = visit(ctx.primaryAnnotationExpression());
        }else{
            //Case of mapping/array/struct
            result = this.parseComplexStructure(ctx);
        }
        return result;
    }


    public SolidityType parseComplexStructure(PrimaryAnnotationExpressionContext ctx){
        //First we have to traverse the tree to get the base variable.
        SolidityType result = SolidityType.UNDEFINED;
        PrimaryAnnotationExpressionContext current = ctx.primaryAnnotationExpression();
        while(current.primaryAnnotationExpression() != null){
            current = current.primaryAnnotationExpression();
        }
        SolidityVariable var = vi.getIdentifier(current.getText(), functionReference);
        
        // Now validate the rest of the structure, from the bottom up
        // For each type of complex structure.
        if(var.type == SolidityType.MAPPING){
            for(int i = 0; i<var.from.length; i++){
                current = (PrimaryAnnotationExpressionContext) current.getParent();
                SolidityType element = visit(current.primaryExpression());
                if(element != var.from[i]){
                    // TODO Report error
                }
            }
            result = var.to;
        }else if(var.type == SolidityType.ARRAY){
            for(int i = 0; i<var.depth; i++){
                current = (PrimaryAnnotationExpressionContext) current.getParent();
                SolidityType element = visit(current.primaryExpression());
                if(element != SolidityType.INTEGER){
                    // TODO Report error
                }

            }
            result = var.to;
        }
        //Parse Struct
        if(var.type == SolidityType.STRUCT ||result == SolidityType.STRUCT){
            //Parse possible structs here.
            while(current != ctx){
                current = (PrimaryAnnotationExpressionContext) current.getParent();
                SolidityStruct struct = vi.getStruct(var.reference);
                for(SolidityVariable elements : struct.elements){
                    if(elements.name.equals(current.identifier().getText())){
                        result = elements.type;
                        var = elements;
                        break;
                    }
                }
            }
        }
        return result;
    }

    @Override
    public SolidityType visitPrimaryExpression(PrimaryExpressionContext ctx){
        if(ctx.numberLiteral() != null){
            return SolidityType.INTEGER;
        }else if(ctx.BooleanLiteral() != null){
            return SolidityType.BOOL;
        }
        return visitChildren(ctx);
    }

    @Override
    public SolidityType visitIdentifier(IdentifierContext ctx){
        SolidityVariable var = vi.getIdentifier(ctx.getText(), functionReference);
        if(var != null){
            return var.type;
        }else{
            addError(ctx, "Identifier %s in annotation not defined as variable", ctx.getText());
            return  SolidityType.UNDEFINED;
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