package model;

public class PInt implements ISerializable {
    private String name;
    private Integer value;

    public PInt(String name, Integer value){
        this.name=name;
        this.value=value;
    }
    public String serialize() {
        return String.format("\"%s\":%d",name,value);
    }
}
