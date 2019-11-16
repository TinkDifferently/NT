package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PObject implements ISerializable {
    private Set<PPrimitive> primitives;
    public PObject(PPrimitive... primitives){
        this.primitives=Arrays.stream(primitives).collect(Collectors.toSet());
    }
    @Override
    public String serialize() {
        StringBuilder builder=new StringBuilder("{");
        for (PPrimitive primitive:primitives){
            builder.append(primitive.serialize())
                .append(',');
        }
        return builder.deleteCharAt(builder.length()-1)
            .append('}')
            .toString();
    }
}
