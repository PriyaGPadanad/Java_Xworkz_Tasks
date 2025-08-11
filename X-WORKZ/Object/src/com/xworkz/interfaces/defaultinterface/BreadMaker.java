package com.xworkz.interfaces.defaultinterface;

public interface BreadMaker {
    default void bakeBread(){
        System.out.println("BreadMaker:Baking bread in standard mode");
    }
}
