package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ElectricGrill;

public class MultiGrill implements ElectricGrill {
    @Override
    public void grillFood(){
        System.out.println("MultiGrill:Grilling with dual temperature zones");
    }
}
