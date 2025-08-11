package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.OilDispenser;

public class SmartDispenser implements OilDispenser {
    @Override
    public void dispense(){
        System.out.println("SmartDispenser:Dispensing controlled oil drops");
    }
}
