package model;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSerializer {
    private static CustomSerializer instance;
    static {
        instance=new CustomSerializer();
    }
    public static CustomSerializer getInstance(){
        return instance;
    }

    private ISerializable map(Field field, Object o){
        String name=field.getName();
        Object value;
        try {
            field.setAccessible(true);
            value=field.get(o);
        } catch (IllegalAccessException e) {
            return new PVoid();
        }
        if (value==null)
            return new PVoid();
        if (value instanceof ISerializable)
            return (ISerializable) value;
        switch (value.getClass().getSimpleName()){
            case "String": return new PString(name, (String) value);
            case "Integer": return new PInt(name, (Integer) value);
        }
        return new PVoid();
    }

    public String serialize(Object o){
        if (o==null)
            return "{}";
        Field[] fields=o.getClass().getDeclaredFields();
        ISerializable[] serializables=new ISerializable[fields.length];
        for (int i=0; i<fields.length;i++)
            serializables[i]=map(fields[i],o);
        return new PObject(serializables).serialize();
    }
}
