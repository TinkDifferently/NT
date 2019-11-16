package model;

public abstract class PPrimitive implements ISerializable {
    private String name;
    private String value;
    private String format;

    PPrimitive(String name, String value, String format){
        this.name=name;
        this.value=value;
        this.format = format;
    }

    PPrimitive(String name, String[] value, String joinFormat, String format){
        this.name=name;
        if (value.length==0) {
            this.format = "%s:[%s]";
            this.value = "";
        }
        else {
            this.value = String.join(joinFormat, value);
            this.format = format;
        }
    }
    public String serialize() {
        return String.format(format,name,value);
    }
}
