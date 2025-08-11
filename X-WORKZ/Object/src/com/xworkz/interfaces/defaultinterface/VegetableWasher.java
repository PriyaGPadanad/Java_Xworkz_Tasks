package com.xworkz.interfaces.defaultinterface;

public interface VegetableWasher {
    default void wash() {
        System.out.println("VegetableWasher: Washing vegetables with water.");
    }
}
