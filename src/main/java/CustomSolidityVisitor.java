import org.antlr.v4.runtime.tree.ParseTree;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.AnnotationDefinitionContext;
import generated.SolidityAnnotatedParser.ContractDefinitionContext;


public class CustomSolidityVisitor extends SolidityAnnotatedBaseVisitor<Void>{
    public CustomSolidityVisitor(ParseTree tree){
        System.out.println("Visitor created");
    }

    @Override
    public Void visitContractDefinition(ContractDefinitionContext ctx) {
        System.out.println("Contract definition visited");
        System.out.println(ctx.getText());
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitAnnotationDefinition(AnnotationDefinitionContext ctx){
        System.out.println("Annotation found");
        System.out.println(ctx.getText());
        for(int i=0; i<ctx.children.size(); i++){
            System.out.println(ctx.getChild(i).getText());
        }
        return null;

    }



}