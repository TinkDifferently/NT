package model;

public enum EnclosingType {
    ARRAY("[","]"),OBJECT("{","}")
    ;
    private String open;
    private String close;
    EnclosingType(String open, String close){
        this.open=open;
        this.close=close;
    }

    public String open() {
        return open;
    }

    public String close() {
        return close;
    }
}
