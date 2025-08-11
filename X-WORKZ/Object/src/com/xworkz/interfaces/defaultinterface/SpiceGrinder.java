package com.xworkz.interfaces.defaultinterface;

public interface SpiceGrinder {
    default void grindSpices() {
        System.out.println("SpiceGrinder: Grinding spices in default mode.");
    }
}
