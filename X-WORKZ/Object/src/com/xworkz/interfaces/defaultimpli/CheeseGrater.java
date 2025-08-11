package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ElectricGrater;

public class CheeseGrater implements ElectricGrater {
    @Override
    public void grate() {
        System.out.println("CheeseGrater: Grating cheese with fine blades.");
    }
}
