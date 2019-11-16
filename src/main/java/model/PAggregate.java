package model;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public abstract class PAggregate implements ISerializable{
    private Collection<ISerializable> serializables;
    private EnclosingType type;
    private String name;

    PAggregate(String name,EnclosingType enclosingType, ISerializable... serializables){
        this.name=name;
        type=enclosingType;
        this.serializables = type.isUnique()
            ? Arrays.stream(serializables).collect(Collectors.toSet())
            : Arrays.stream(serializables).collect(Collectors.toList());
    }

    private final Function<String,String> namedSupplier=(serialized)->String.format("%s=%s%s%s",name,type.open(),serialized,type.close());
    private final Function<String,String> generalSupplier=(serialized)->String.format("%s%s%s",type.open(),serialized,type.close());
    @Override
    public String serialize() {
        String serialized= serializables.stream()
            .map(ISerializable::serialize)
            .collect(Collectors.joining(","));
        Function<String,String> result= null==name
            ? generalSupplier
            : namedSupplier;
        return result.apply(serialized);
    }
}
