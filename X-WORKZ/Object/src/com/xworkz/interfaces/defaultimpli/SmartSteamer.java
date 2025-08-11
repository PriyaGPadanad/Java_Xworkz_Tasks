package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ElectricSteamer;

public class SmartSteamer implements ElectricSteamer {
    @Override
    public void steam(){
        System.out.println("SmartSteamer:Steaming vegetables with timer ");
    }
}
