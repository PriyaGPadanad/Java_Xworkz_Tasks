package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.VegetableWasher;

public class UltrasonicWasher implements VegetableWasher {
    @Override
    public void wash() {
        System.out.println("UltrasonicWasher: Washing veggies with ultrasonic vibration.");
    }
}
