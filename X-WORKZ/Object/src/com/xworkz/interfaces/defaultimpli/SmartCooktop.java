package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.InductionCooktop;

public class SmartCooktop implements InductionCooktop {
    @Override
    public void heat(){
        System.out.println("SmartCooktop:Heating with auto pan detection");
    }
}
