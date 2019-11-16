package model;

public class PObject extends PAggregate {

    public PObject(ISerializable... serializables) {
        super(EnclosingType.OBJECT, serializables);
    }
}
