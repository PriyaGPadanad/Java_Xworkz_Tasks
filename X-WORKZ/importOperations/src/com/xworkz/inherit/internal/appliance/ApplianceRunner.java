package com.xworkz.inherit.internal.appliance;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance1 = new Appliance();
        appliance1.switchOn();
        appliance1.switchOff();
        appliance1.consumePower();
        appliance1.operate();
        appliance1.maintain();

        System.out.println("-------------------");
        Appliance appliance2 = new WashingMachine();
        appliance2.switchOn();
        appliance2.switchOff();
        appliance2.consumePower();
        appliance2.operate();
        appliance2.maintain();

        System.out.println("-----------------");
        WashingMachine wm = new WashingMachine();
        wm.switchOn();
        wm.switchOff();
        wm.consumePower();
        wm.operate();
        wm.maintain();

        System.out.println("-------casting example------------");
        Technician technician = new Technician();
        technician.check(appliance1);
        technician.check(appliance2);
        technician.check(wm);
    }
}
