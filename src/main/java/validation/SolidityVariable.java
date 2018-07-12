package validation;
public class SolidityVariable {
    public String name;
    public SolidityType type;
    public String reference;

    public SolidityVariable(String name, SolidityType type, String reference){
        this.name = name;
        this.type = type;
        this.reference = reference;
    }
}