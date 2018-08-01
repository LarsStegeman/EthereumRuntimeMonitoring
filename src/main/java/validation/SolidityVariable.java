package validation;
public class SolidityVariable {
    public String name;
    public SolidityType type;
    public String reference;

    //In case of mapping
    public SolidityType[] from;
    public SolidityType to;

    //In case of array
    public int depth;

    public SolidityVariable(String name, SolidityType type, String reference){
        this.name = name;
        this.type = type;
        this.reference = reference;
    }

    public SolidityVariable(String name, SolidityType[] from, SolidityType to, String reference){
        this.name = name;
        this.type = SolidityType.MAPPING;
        this.from = from;
        this.to = to;
        this.reference = reference;
    }

    public SolidityVariable(String name, int depth, SolidityType to, String reference){
        this.name = name;
        this.type = SolidityType.ARRAY;
        this.depth = depth;
        this.to = to;
        this.reference = reference;
    }


}