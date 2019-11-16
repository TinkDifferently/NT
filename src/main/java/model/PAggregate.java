package model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class PAggregate implements ISerializable{
    private Collection<ISerializable> serializables;
    private EnclosingType type;
    public PAggregate(EnclosingType enclosingType, boolean isUnique, ISerializable... serializables){
        this.serializables = isUnique
            ? Arrays.stream(serializables).collect(Collectors.toSet())
            : Arrays.stream(serializables).collect(Collectors.toList());
    }
    @Override
    public String serialize() {
        StringBuilder builder=new StringBuilder(type.open());
        for (ISerializable serializable: serializables){
            builder.append(serializable.serialize())
                .append(',');
        }
        return builder.deleteCharAt(builder.length()-1)
            .append(type.close())
            .toString();
    }
}
