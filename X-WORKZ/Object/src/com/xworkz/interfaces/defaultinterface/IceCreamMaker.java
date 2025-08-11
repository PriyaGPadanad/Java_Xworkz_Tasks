package com.xworkz.interfaces.defaultinterface;

public interface IceCreamMaker {
    default void freeze(){
        System.out.println("IceCreamMaker:Freezing in default mode");
    }
}
