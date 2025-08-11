package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.KitchenTimer;

public class DigitalTimer implements KitchenTimer {
    @Override
    public void setTimer() {
        System.out.println("DigitalTimer: Timer set with LED and buzzer.");
    }
}
