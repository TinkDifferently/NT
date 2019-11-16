package main;

import java.util.ArrayList;
import java.util.List;
import model.ISerializable;
import model.PInt;
import model.PObject;
import model.PString;

public class Main {
    static List<ISerializable> models;
    static {
        PInt pInt=new PInt("num",5);
        PString pString=new PString("str","str value");
        models=new ArrayList<>();
        models.add(new PObject(pInt,pString));
    }

    public static void main(String [] args){
        for (ISerializable serializable : models) {
            System.out.println(serializable.serialize());
        }
    }
}
