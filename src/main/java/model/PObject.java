package model;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class PObject implements ISerializable {
    private Set<ISerializable> serializables;
    public PObject(ISerializable... serializables){
        this.serializables =Arrays.stream(serializables).collect(Collectors.toSet());
    }
    @Override
    public String serialize() {
        StringBuilder builder=new StringBuilder("{");
        for (ISerializable serializable: serializables){
            builder.append(serializable.serialize())
                .append(',');
        }
        return builder.deleteCharAt(builder.length()-1)
            .append('}')
            .toString();
    }
}
