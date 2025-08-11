package com.xworkz.interfaces.defaultimpli;

public class MiniTandoor implements ElectricTandoor{
    @Override
    public void grill(){
        System.out.println("MiniTandoor:Grilling with temperature control");
    }
}
