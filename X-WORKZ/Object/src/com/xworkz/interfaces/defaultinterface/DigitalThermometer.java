package com.xworkz.interfaces.defaultinterface;

public interface DigitalThermometer {
    default void measure(){
        System.out.println("DigitalThermometer: Measuring temperature.");
    }
}
