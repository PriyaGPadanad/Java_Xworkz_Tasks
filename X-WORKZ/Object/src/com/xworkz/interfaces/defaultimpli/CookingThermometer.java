package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.DigitalThermometer;

public class CookingThermometer implements DigitalThermometer {
    @Override
    public void measure() {
        System.out.println("CookingThermometer: Measuring internal food temperature accurately.");
    }
}
