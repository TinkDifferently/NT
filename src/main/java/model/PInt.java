package model;

public class PInt extends PPrimitive {
    public PInt(String name, Integer value) {
        super(name,value,JsonRules.INT_RULE);
    }
}
