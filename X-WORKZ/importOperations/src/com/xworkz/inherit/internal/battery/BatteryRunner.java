package com.xworkz.inherit.internal.battery;

public class BatteryRunner {
    public static void main(String[] args) {
        Battery b1 = new Battery();
        b1.charge();
        b1.discharge();
        b1.storeEnergy();
        b1.showVoltage();
        b1.recycle();

        System.out.println("-------------------");
        Battery b = new LithiumBattery();
        b.charge();
        b.discharge();
        b.storeEnergy();
        b.showVoltage();
        b.recycle();

        System.out.println("-----------------");
        LithiumBattery lithiumBattery = new LithiumBattery();
        lithiumBattery.charge();
        lithiumBattery.discharge();
        lithiumBattery.storeEnergy();
        lithiumBattery.showVoltage();
        lithiumBattery.recycle();

        System.out.println("-------casting example------------");
        Technician technician = new Technician();
        technician.test(b1);
        technician.test(b);
        technician.test(lithiumBattery);
    }
}
