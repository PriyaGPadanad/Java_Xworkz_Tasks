package com.xworkz.inherit.internal.appliance;

public class Technician {
    public void check(Appliance appliance) {
        appliance.switchOn();
        appliance.switchOff();
        appliance.consumePower();
        appliance.operate();
        appliance.maintain();

        if(appliance instanceof WashingMachine) {
            System.out.println("appliance is an instance of WashingMachine");
            WashingMachine wm = (WashingMachine) appliance;
            wm.rinseClothes();
        }
    }
}
