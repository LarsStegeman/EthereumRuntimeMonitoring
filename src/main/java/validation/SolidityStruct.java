package validation;

public class SolidityStruct{
    public String name;
    public SolidityVariable[] elements;

    public SolidityStruct(String name, SolidityVariable[] elements){
        this.name = name;
        this.elements = elements;
    }
}