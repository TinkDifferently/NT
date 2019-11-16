package model;

import java.util.Arrays;
import java.util.List;

public class PArray implements ISerializable {
    private List<ISerializable> serializables;
    public PArray(ISerializable... serializables){
        this.serializables = Arrays.asList(serializables);
    }
    @Override
    public String serialize() {
        StringBuilder builder=new StringBuilder("[");
        for (ISerializable serializable: serializables){
            builder.append(serializable.serialize())
                .append(',');
        }
        return builder.deleteCharAt(builder.length()-1)
            .append(']')
            .toString();
    }
}
