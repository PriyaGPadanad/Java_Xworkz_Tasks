package com.xworkz.interfaces.defaultinterface;

public interface SoupMaker {
    default void makeSoup(){
        System.out.println("SoupMaker:Making soup in default mode");
    }
}
