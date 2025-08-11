package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ElectricWok;

public class SmartWok implements ElectricWok {
    @Override
    public void stirFry() {
        System.out.println("SmartWok: Stir-frying with smart temperature control.");
    }
}
