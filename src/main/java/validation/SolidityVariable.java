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

    public SolidityVariable(String name, SolidityType type, String reference, SolidityType[] from, SolidityType to, int depth){
        this.name = name;
        this.type= type;
        this.reference = reference;
        this.from = from;
        this.to = to;
        this.depth = depth;
    }

    public String getTypeString(){
        switch(this.type){
                case ADDRESS:   return "address";
                case INTEGER:   return "uint256";
                case BOOL:      return "bool";
                case STRING:    return "string";
                case BYTE:      return "byte256";
                case STRUCT:        
                case MAPPING:
                case ARRAY:     return reference;
                default:        return "undefined";
            }
    }

    public SolidityVariable getOldSolidityVariable(){
        return new SolidityVariable(this.name + "_old", type, reference, from, to ,depth);
    }

}