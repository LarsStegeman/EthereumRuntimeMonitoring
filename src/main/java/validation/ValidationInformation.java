package validation;

import java.util.ArrayList;

public class ValidationInformation {
    ArrayList<SolidityVariable> identifiers;
    ArrayList<SolidityFunction> functions;

    public ValidationInformation(){
        identifiers = new ArrayList<SolidityVariable>();
        functions = new ArrayList<SolidityFunction>();
    }


    public void addIdentifier(String name, SolidityType type){
        identifiers.add(new SolidityVariable(name,type));
    }

    public void addFunction(String name, SolidityVariable[] arguments){
        functions.add(new SolidityFunction(name,arguments));
    }

    public SolidityVariable getIdentifier(String identifier, String function){
        for(SolidityVariable var: identifiers){
            if(var.name.equals(identifier)){
                return var;
            }
        }
        for(SolidityFunction func: functions){
            if(func.name.equals(function)){
                for(SolidityVariable var: func.arguments){
                    if(var.name.equals(identifier)){
                        return var;
                    }
                }
            }
        }
        return null;
    }

    public SolidityFunction getFunction(String name){
        for(SolidityFunction var: functions){
            if(var.name.equals(name)){
                return var;
            }
        }
        return null;
    }

}




