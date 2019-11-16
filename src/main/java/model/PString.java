package model;

public class PString extends PPrimitive {
    public PString(String name, String value) {
        super(name,value,JsonRules.STRING_RULE);
    }
}
