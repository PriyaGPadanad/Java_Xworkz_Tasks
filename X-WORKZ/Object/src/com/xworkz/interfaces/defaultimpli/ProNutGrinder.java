package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.NutGrinder;

public class ProNutGrinder implements NutGrinder {
    @Override
    public void grindNuts(){
        System.out.println("ProNutGrinder:Fine grinding with stainless steel blades");
    }
}
