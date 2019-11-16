package model;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PInt extends PPrimitive {
    public PInt(String name, Integer value) {
        super(name,String.valueOf(value),JsonRules.STRING_RULE);
    }

    public PInt(String name, Integer[] values){
        super(name, Arrays.stream(values).map(String::valueOf).collect(Collectors.joining(",")).split(","), ",","%s:[%s]");
    }
}
