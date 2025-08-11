package com.xworkz.interfaces.defaultinterface;

public interface ElectricOpener {
    default void open() {
        System.out.println("ElectricOpener: Opening can in default mode.");
    }
}
