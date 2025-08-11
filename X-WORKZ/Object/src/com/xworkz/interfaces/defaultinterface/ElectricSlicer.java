package com.xworkz.interfaces.defaultinterface;

public interface ElectricSlicer {
    default void slice() {
        System.out.println("ElectricSlicer: Slicing at standard thickness.");
    }
}
