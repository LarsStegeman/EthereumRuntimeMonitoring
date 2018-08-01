package validation;

import java.util.ArrayList;

public class ValidationInformation {
    ArrayList<SolidityVariable> identifiers;
    ArrayList<SolidityFunction> functions;
    ArrayList<SolidityStruct> structs;

    public ValidationInformation(){
        identifiers = new ArrayList<SolidityVariable>();
        functions = new ArrayList<SolidityFunction>();
        structs = new ArrayList<SolidityStruct>();
    }


    public void addIdentifier(String name, SolidityType type, String reference){
        identifiers.add(new SolidityVariable(name,type, reference));
    }

    public void addMapping(String name, SolidityType[] keys, SolidityType value, String reference){
        identifiers.add(new SolidityVariable(name,keys,value,reference));
    }

    public void addArray(String name, int depth, SolidityType value, String reference){
        identifiers.add(new SolidityVariable(name,depth,value,reference));
    }

    public void addFunction(String name, SolidityVariable[] arguments){
        functions.add(new SolidityFunction(name,arguments));
    }

    public void addStruct(String name, SolidityVariable[] elements){
        structs.add(new SolidityStruct(name, elements));
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

    public SolidityStruct getStruct(String name){
        for(SolidityStruct var: structs){
            if(var.name.equals(name)){
                return var;
            }
        }
        return null;
    }

    public String getReference(String name){
        for(SolidityVariable var: identifiers){
            if(var.name.equals(name)){
                return var.reference;
            }
        }
        return null;
    }

    public SolidityStruct getStructByReference(String identifierName){
        return getStruct(getReference(identifierName));
    }
}




