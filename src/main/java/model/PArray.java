package model;

public class PArray extends PAggregate {

    public PArray(ISerializable... serializables) {
        super(EnclosingType.ARRAY, serializables);
    }
}
