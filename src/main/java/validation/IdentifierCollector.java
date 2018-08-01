package validation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import generated.SolidityAnnotatedBaseVisitor;
import generated.SolidityAnnotatedParser.FunctionDefinitionContext;
import generated.SolidityAnnotatedParser.MappingContext;
import generated.SolidityAnnotatedParser.ParameterContext;
import generated.SolidityAnnotatedParser.StateVariableDeclarationContext;
import generated.SolidityAnnotatedParser.StructDefinitionContext;
import generated.SolidityAnnotatedParser.TypeNameContext;
import generated.SolidityAnnotatedParser.VariableDeclarationContext;



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
        if(ctx.typeName().mapping() != null){
            // Mapping case
            parseMapping(ctx.typeName().mapping(), ctx.identifier().getText());
        }else if(ctx.typeName().typeName() != null){
            // Array case
            parseArray(ctx.typeName(), ctx.identifier().getText());
        }else{
            // Struct or other state variable
            info.addIdentifier(ctx.identifier().getText(), getType(ctx.typeName().getText()), ctx.typeName().getText());
        }
        return null;
    }

    @Override
    public Void visitFunctionDefinition(FunctionDefinitionContext ctx){
        System.out.println("FunctionDef: " + ctx.getText());
        //Skip fallback function
        if(ctx.identifier() != null){
            ArrayList<SolidityVariable> args = new ArrayList<SolidityVariable>();
            for(ParameterContext i : ctx.parameterList().parameter()){
                args.add(new SolidityVariable(i.identifier().getText(), getType(i.typeName().getText()), i.typeName().getText()));
            }
            SolidityVariable[] array = new SolidityVariable[args.size()];
            args.toArray(array);
            info.addFunction(ctx.identifier().getText(), array);
        }
        return null;
    }

    @Override
    public Void visitStructDefinition(StructDefinitionContext ctx){
        ArrayList<SolidityVariable> elements = new ArrayList<SolidityVariable>();
        for(VariableDeclarationContext i : ctx.variableDeclaration()){
            elements.add(new SolidityVariable(i.identifier().getText(),getType(i.typeName().getText()), i.typeName().getText()));
        }
        SolidityVariable[] array = new SolidityVariable[elements.size()];
        elements.toArray(array);
        info.addStruct(ctx.identifier().getText(), array);
        return null;
    }

    public void parseMapping(MappingContext ctx, String identifier){
        ArrayList<SolidityType> keys = new ArrayList<>();
        keys.add(getType(ctx.elementaryTypeName().getText()));
        //Go recursive in object for more possible mappings
        TypeNameContext current = ctx.typeName();
        while(current.mapping() != null){
            keys.add(getType(current.mapping().elementaryTypeName().getText()));
            current = current.mapping().typeName();
        }
        SolidityType[] keyArray = new SolidityType[keys.size()];
        keys.toArray(keyArray);
        SolidityType value = getType(current.getText());
        String reference = current.getText();
        //Add mapping
        info.addMapping(identifier, keyArray, value, reference);
    }

    public void parseArray(TypeNameContext ctx, String identifier){
        int depth = 1;
        TypeNameContext current = ctx.typeName();
        while(current.typeName() != null){
            depth++;
            current = current.typeName();
        }
        info.addArray(identifier, depth,getType(current.getText()), ctx.typeName().getText());
    }

    /*
        Function returns one of the SolidityType depending on the input
        Solidity has many types, they are reduced to the base types.
    */

    private List<String> integers = Arrays.asList("int" , "int8" , "int16" , "int24" , "int32" , "int40" , "int48" , "int56" , "int64" , "int72" , "int80" , "int88" , "int96" , "int104" , "int112" , "int120" , "int128" , "int136" , "int144" , "int152" , "int160" , "int168" , "int176" , "int184" , "int192" , "int200" , "int208" , "int216" , "int224" , "int232" , "int240" , "int248" ,"int256", 
    "uint" , "uint8" , "uint16" , "uint24" , "uint32" , "uint40" , "uint48" , "uint56" , "uint64" , "uint72" , "uint80" , "uint88" , "uint96" , "uint104" , "uint112" , "uint120" , "uint128" , "uint136" , "uint144" , "uint152" , "uint160" , "uint168" , "uint176" , "uint184" , "uint192" , "uint200" , "uint208" , "uint216" , "uint224" , "uint232" , "uint240" , "uint248" ,"uint256");
    private List<String> bytes = Arrays.asList("bytes" , "bytes1" , "bytes2" , "bytes3" , "bytes4" , "bytes5" , "bytes6" , "bytes7" , "bytes8" , "bytes9" , "bytes10" , "bytes11" , "bytes12" , "bytes13" , "bytes14" , "bytes15" , "bytes16" , "bytes17" , "bytes18" , "bytes19" , "bytes20" , "bytes21" , "bytes22" , "bytes23" , "bytes24" , "bytes25" , "bytes26" , "bytes27" , "bytes28" , "bytes29" , "bytes30" , "bytes31" , "bytes32");

    public SolidityType getType(String input){
        if(input == null){
            return SolidityType.UNDEFINED;
        }else if(integers.contains(input)){
            return SolidityType.INTEGER;
        }else if(bytes.contains(input)){
            return SolidityType.BYTE;
        }else if(input.equals("bool")){
            return SolidityType.BOOL;
        }else if(input.equals("address")){
            return SolidityType.ADDRESS;
        }else if(input.equals("string")){
            return SolidityType.STRING;
        }else{
            return SolidityType.STRUCT;
        }
    }
}