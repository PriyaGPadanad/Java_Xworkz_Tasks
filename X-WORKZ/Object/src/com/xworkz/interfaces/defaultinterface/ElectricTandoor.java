package com.xworkz.interfaces.defaultinterface;

public interface ElectricTandoor {
    default void grill(){
        System.out.println("ElectricTandoor:Default grill mode");
    }
}
