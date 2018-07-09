package validation;
public class SolidityVariable {
    public String name;
    public SolidityType type;

    public SolidityVariable(String name, SolidityType type){
        this.name = name;
        this.type = type;
    }
}