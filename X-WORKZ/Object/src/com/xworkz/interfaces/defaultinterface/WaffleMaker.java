package com.xworkz.interfaces.defaultinterface;

public interface WaffleMaker {
    default void makeWaffle(){
        System.out.println("WaffleMaker :Default waffle cooking");
    }
}
