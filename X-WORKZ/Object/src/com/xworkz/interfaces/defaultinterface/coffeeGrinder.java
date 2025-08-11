package com.xworkz.interfaces.defaultinterface;

public interface coffeeGrinder {
    default void grind(){
        System.out.println("CoffeeGrinder:Default grinding");
    }
}
