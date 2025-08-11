package com.xworkz.interfaces.defaultinterface;

public interface RotiMaker {
    default void makeRoti(){
        System.out.println("RotiMaker:Making round rotis");
    }
}
