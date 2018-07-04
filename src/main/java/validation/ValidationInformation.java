package validation;

import java.util.ArrayList;

public class ValidationInformation {
    ArrayList<SolidityVariable> identifiers;
    ArrayList<FunctionSignature> functions;

    public ValidationInformation(){
        identifiers = new ArrayList<SolidityVariable>();
        functions = new ArrayList<FunctionSignature>();
    }


    public void addIdentifier(String name, String type){
        identifiers.add(new SolidityVariable(name,type));
    }

    public void addFunction(String name, String[] arguments){
        functions.add(new FunctionSignature(name,arguments));
    }

    public SolidityVariable getIdentifier(String identifier){
        for(SolidityVariable var: identifiers){
            if(var.name.equals(identifier)){
                return var;
            }
        }
        return null;
    }

}


class FunctionSignature{
    String name;
    String[] arguments;

    public FunctionSignature(String name, String[] arguments){
        this.name = name;
        this.arguments = arguments;
    }
}

