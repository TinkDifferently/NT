package main;

import model.ISerializable;
import model.PString;

public class Main {
    static ISerializable model;
    static {
        model=new PString("name","value");
    }

    public static void main(String [] args){
        System.out.println(model.serialize());
    }
}
