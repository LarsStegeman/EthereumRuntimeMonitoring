package generation;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;

import validation.SolidityVariable;

public class AnnotationInformation{
    ParserRuleContext node;
    private String name;
    private List<SolidityVariable> variables;
    private String type;
    private String function;

    public AnnotationInformation(ParserRuleContext ctx, String name, String type, String function){
        this.variables = new ArrayList<>();
        this.name = name;
        this.function = function;
        this.node = ctx;
        this.type = type;
    }

    public void addVariable(SolidityVariable var){
        for(SolidityVariable x: variables){
            if(x.name.equals(var.name)){
                return;
            }
        }
        variables.add(var);
    }

    public List<SolidityVariable> getVariables(){
        return variables;
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