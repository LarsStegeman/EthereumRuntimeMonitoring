package generation;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.antlr.v4.runtime.ParserRuleContext;

import validation.SolidityVariable;

public class AnnotationInformation{
    ParserRuleContext node;
    private String name;
    private Map<SolidityVariable, Boolean> variables;
    private String type;
    private String function;

    public AnnotationInformation(ParserRuleContext ctx, String name, String type, String function){
        this.variables = new LinkedHashMap<>();
        this.name = name;
        this.function = function;
        this.node = ctx;
        this.type = type;
    }

    public void addVariable(SolidityVariable var, boolean argument){
        for(SolidityVariable x: variables.keySet()){
            if(x.name.equals(var.name)){
                return;
            }
        }
        variables.put(var, argument);
    }

    public Set<SolidityVariable> getVariables(){
        return variables.keySet();
    }

    public Set<SolidityVariable> getArgumentVariables(){
        Set<SolidityVariable> all = new LinkedHashSet<SolidityVariable>();
        for(Entry<SolidityVariable, Boolean> x: variables.entrySet()){
            if(x.getValue()){
                all.add(x.getKey());
            }
        }
        return all;
    }

    public String getFunction(){
        return function;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public ParserRuleContext getNode(){
        return node;
    }


}