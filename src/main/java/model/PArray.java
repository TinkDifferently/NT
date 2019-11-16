package model;

import java.util.Arrays;

public class PArray<T extends ISerializable> extends PAggregate {
    public PArray(T... serializables) {
        this(null,serializables);
    }

    public PArray(String name,T... serializables) {
        super(name,EnclosingType.ARRAY, serializables);
        if (Arrays.stream(serializables).map(Object::getClass).distinct().count()!=1){
            throw new MultiTypeException("Объекты внутри массива должны быть одного типа");
        }
    }
}
