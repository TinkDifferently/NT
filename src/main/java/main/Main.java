package main;

import model.ISerializable;

public class Main {
    static ISerializable model;
    {

    }

    public static void main(String [] args){
        System.out.println(model.serialize());
    }
}
