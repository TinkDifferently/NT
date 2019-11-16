package main;

import java.util.ArrayList;
import java.util.List;
import model.ISerializable;
import model.PArray;
import model.PInt;
import model.PObject;
import model.PString;

public class Main {
    static List<ISerializable> models;
    static {
        PInt pInt=new PInt("num",5);
        PString pString=new PString("str","str value");
        PObject pObject=new PObject(pInt,pString);
        PObject ppObject=new PObject(pObject);
        PArray pArray=new PArray(pObject,pObject);
        models=new ArrayList<>();
        models.add(ppObject);
        models.add(new PArray<>(pArray,pArray));
    }

    public static void main(String [] args){
        for (ISerializable serializable : models) {
            System.out.println(serializable.serialize());
        }
    }
}
