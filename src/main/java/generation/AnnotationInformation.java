package generation;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class AnnotationInformation{
    ParserRuleContext node;
    private String name;
    private List<String> variables;
    private String type;
    private String function;

    public AnnotationInformation(ParserRuleContext ctx, String name, String type, String function){
        this.variables = new ArrayList<String>();
        this.name = name;
        this.function = function;
        this.node = ctx;
        this.type = type;
    }

    public void addVariable(String varName){
        variables.add(varName);
    }

    public List<String> getVariables(){
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