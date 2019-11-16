package model;

public class PString implements ISerializable {
    private String name;
    private String value;

    public PString(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String serialize() {
        return String.format("\"%s\":\"%s\"",name,value);
    }
}
