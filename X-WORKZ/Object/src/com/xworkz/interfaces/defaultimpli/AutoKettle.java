package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ElectricKettle;

public class AutoKettle implements ElectricKettle {
    @Override
    public void boil(){
        System.out.println("AutoKettle:Fast boiling with auto shutoff");
    }
}
