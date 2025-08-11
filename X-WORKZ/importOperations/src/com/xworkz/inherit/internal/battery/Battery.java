package com.xworkz.inherit.internal.battery;

public class Battery {
    public void charge() {
        System.out.println("Charging the battery--parent");
    }
    public void discharge() {
        System.out.println("Discharging the battery--parent");
    }
    public void storeEnergy() {
        System.out.println("Battery storing energy--parent");
    }
    public void showVoltage() {
        System.out.println("Displaying battery voltage--parent");
    }
    public void recycle() {
        System.out.println("Recycling the battery--parent");
    }
}
