package model;

public enum EnclosingType {
    ARRAY("[","]",false),OBJECT("{","}",true)
    ;
    private String open;
    private String close;
    private boolean isUnique;
    EnclosingType(String open, String close, boolean isUnique){
        this.open=open;
        this.close=close;
        this.isUnique=isUnique;
    }

    public String open() {
        return open;
    }

    public String close() {
        return close;
    }

    public boolean isUnique() {
        return isUnique;
    }
}
