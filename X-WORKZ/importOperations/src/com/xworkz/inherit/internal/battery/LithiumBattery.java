package com.xworkz.inherit.internal.battery;

public class LithiumBattery extends Battery{
    public LithiumBattery() {
        super();
        System.out.println("Running non-arg constructor LithiumBattery");
    }

    @Override
    public void charge() {
        System.out.println("Fast charging lithium battery--child");
    }

    @Override
    public void discharge() {
        System.out.println("Discharging lithium battery efficiently--child");
    }

    @Override
    public void storeEnergy() {
        System.out.println("Lithium battery storing large amount of energy--child");
    }

    @Override
    public void showVoltage() {
        System.out.println("Lithium battery shows stable voltage--child");
    }

    @Override
    public void recycle() {
        System.out.println("Recycling lithium battery safely--child");
    }

    public void checkTemperature() {
        System.out.println("New method checkTemperature in child class");
    }
}
