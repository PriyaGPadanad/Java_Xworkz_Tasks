package com.xworkz.interfaces.defaultinterface;

public interface RiceCooker {
    default void cookRice(){
        System.out.println("RiceCooker:Default cooking mode");

    }
}
