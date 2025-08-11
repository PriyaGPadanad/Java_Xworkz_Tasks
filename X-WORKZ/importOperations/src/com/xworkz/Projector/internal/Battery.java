package com.xworkz.Projector.internal;

public class Battery {
    int voltage;

    public Battery() {
        voltage = 5;
    }

    public void providePower() {
        System.out.println("Battery providing power.");
    }
}
