package com.xworkz.interfaces.defaultinterface;

public interface Chopper {
    default void chop(){
        System.out.println("Chopper:Chopping vegetables in default mode");
    }
}
