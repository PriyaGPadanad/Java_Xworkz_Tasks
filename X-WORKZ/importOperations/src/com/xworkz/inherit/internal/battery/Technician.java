package com.xworkz.inherit.internal.battery;

public class Technician {
    public void test(Battery battery) {
        battery.charge();
        battery.discharge();
        battery.storeEnergy();
        battery.showVoltage();
        battery.recycle();

        if (battery instanceof LithiumBattery) {
            System.out.println("battery is an instance of LithiumBattery");
            LithiumBattery lb = (LithiumBattery) battery;
            lb.checkTemperature();
        }
    }
}
