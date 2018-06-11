import org.antlr.v4.runtime.tree.ParseTree;

import generated.SolidityBaseVisitor;
import generated.SolidityParser.ContractDefinitionContext;


public class CustomSolidityVisitor extends SolidityBaseVisitor<Void>{
    public CustomSolidityVisitor(ParseTree tree){
        System.out.println("Visitor created");
        tree.accept(this);
    }

    @Override
    public Void visitContractDefinition(ContractDefinitionContext ctx) {
        System.out.println("Contract definition visited");
        return null;
    }
}