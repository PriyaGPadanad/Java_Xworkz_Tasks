package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.Chopper;

public class PowerChopper implements Chopper {
    @Override
    public void chop(){
        System.out.println("PowerChopping:Chopping with high-speed blades");
    }
}
