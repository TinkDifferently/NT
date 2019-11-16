package model;

public class PString extends PPrimitive {
    public PString(String name, String value) {
        super(name,value,JsonRules.STRING_RULE);
    }

    public PString(String name, String[] values){
        super(name,values,"\",\"","%s:[\"%s\"]");
    }
}
