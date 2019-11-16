package model;

public class PObject extends PAggregate {

    public PObject(ISerializable... serializables) {
        this(null,serializables);
    }

    public PObject(String name,ISerializable... serializables) {
        super(name,EnclosingType.OBJECT, serializables);
    }
}
