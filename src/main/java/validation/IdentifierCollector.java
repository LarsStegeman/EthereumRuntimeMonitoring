package validation;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.FunctionDefinitionContext;
import generated.SolidityAnnotatedParser.ParameterListContext;
import generated.SolidityAnnotatedParser.StateVariableDeclarationContext;



// Class will collect all state variables and functions with arguments and stores them in an object.
public class IdentifierCollector extends SolidityAnnotatedBaseVisitor<Void>{
    ValidationInformation info;

    public IdentifierCollector(ValidationInformation info){
        this.info = info;
        System.out.println("IdentifierCollector created");
    }

    @Override
    public Void visitStateVariableDeclaration(StateVariableDeclarationContext ctx){
        System.out.println("VariableDecl: " + ctx.getText());
        info.addIdentifier(ctx.identifier().getText(), ctx.typeName().getText());
        return null;
    }

    @Override
    public Void visitFunctionDefinition(FunctionDefinitionContext ctx){
        System.out.println("FunctionDef: " + ctx.getText());
        //Skip fallback function
        if(ctx.identifier() != null){
            ArrayList<String> args = new ArrayList<String>();
            for(ParseTree i : ctx.parameterList().children){
                args.add(i.getText());
            }
            String[] array = new String[args.size()];
            args.toArray(array);
            info.addFunction(ctx.identifier().getText(), array);
        }

        return null;

    }



}