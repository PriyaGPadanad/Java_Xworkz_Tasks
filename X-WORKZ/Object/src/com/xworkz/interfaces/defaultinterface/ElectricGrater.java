package com.xworkz.interfaces.defaultinterface;

public interface ElectricGrater {
    default void grate() {
        System.out.println("ElectricGrater: Grating in standard mode.");
    }
}
