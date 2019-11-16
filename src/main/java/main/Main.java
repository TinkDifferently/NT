package main;

import model.ISerializable;
import model.PInt;
import model.PString;

public class Main {
    static ISerializable model;
    static {
        model=new PInt("name",5);
    }

    public static void main(String [] args){
        System.out.println(model.serialize());
    }
}
