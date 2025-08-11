package com.xworkz.inherit.internal.appliance;

public class Appliance {
    public void switchOn() {
        System.out.println("Appliance is switched on--parent");
    }

    public void switchOff() {
        System.out.println("Appliance is switched off--parent");
    }

    public void consumePower() {
        System.out.println("Appliance consumes electricity--parent");
    }

    public void operate() {
        System.out.println("Appliance is operating--parent");
    }

    public void maintain() {
        System.out.println("Appliance needs regular maintenance--parent");
    }
}
