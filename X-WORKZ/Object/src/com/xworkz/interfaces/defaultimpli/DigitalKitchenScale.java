package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.KitchenScale;

public class DigitalKitchenScale implements KitchenScale {
    @Override
    public void weigh() {
        System.out.println("DigitalKitchenScale: Weighing with precision and LCD display.");
    }
}
