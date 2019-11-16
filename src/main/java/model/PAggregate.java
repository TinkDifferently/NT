package model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class PAggregate implements ISerializable{
    private Collection<ISerializable> serializables;
    private EnclosingType type;
    PAggregate(EnclosingType enclosingType, ISerializable... serializables){
        type=enclosingType;
        this.serializables = type.isUnique()
            ? Arrays.stream(serializables).collect(Collectors.toSet())
            : Arrays.stream(serializables).collect(Collectors.toList());
    }
    @Override
    public String serialize() {
        String serialized= serializables.stream()
            .map(ISerializable::serialize)
            .collect(Collectors.joining(","));
        return String.format("%s%s%s",type.open(),serialized,type.close());
    }
}
