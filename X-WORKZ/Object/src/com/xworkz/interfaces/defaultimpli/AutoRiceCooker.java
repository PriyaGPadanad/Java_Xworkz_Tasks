package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.RiceCooker;

public class AutoRiceCooker implements RiceCooker {
    @Override
    public void cookRice(){
        System.out.println("AutoRiceCooker : cooking with water level sensor");
    }
}
