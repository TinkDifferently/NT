package model;

public abstract class PPrimitive implements ISerializable {
    private String name;
    private Object value;
    private String format;

    PPrimitive(String name, Object value, String format){
        this.name=name;
        this.value=value;
        this.format = format;
    }
    public String serialize() {
        return String.format(format,name,value);
    }
}
