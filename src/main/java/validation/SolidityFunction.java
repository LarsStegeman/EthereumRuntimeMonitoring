package validation;

public class SolidityFunction{
    public String name;
    public SolidityVariable[] arguments;

    public SolidityFunction(String name, SolidityVariable[] arguments){
        this.name = name;
        this.arguments = arguments;
    }
}