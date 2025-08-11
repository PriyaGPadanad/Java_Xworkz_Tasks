package com.xworkz.interfaces.defaultinterface;

public interface OilDispenser {
    default void dispense(){
        System.out.println("OilDispenser:Dispensing with default flow");
    }
}
