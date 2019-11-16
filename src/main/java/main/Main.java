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
        PObject pObject=new PObject("object",pInt,pString);
        PArray pArray=new PArray("array");
        PObject ppObject=new PObject(pObject,pArray);
        models=new ArrayList<>();
        models.add(ppObject);
        //models.add(new PArray<>(pArray,pArray));
    }

    public static void main(String [] args){
        for (ISerializable serializable : models) {
            System.out.println(serializable.serialize());
        }
    }
}
