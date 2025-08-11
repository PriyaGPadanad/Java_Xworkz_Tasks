package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ElectricPeeler;

public class AutoPeeler implements ElectricPeeler {
    @Override
    public void peel(){
        System.out.println("AutoPeeler:Peeling with adjustable blade settings");
    }
}
