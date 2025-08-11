package com.xworkz.inheritance.hierarchical.ex8;

public class ApplianceRunner {
    public static void main(String[] args){
        WashingMachine wm=new WashingMachine();
        wm.turnOn();
        wm.washClothes();

        Refrigerator rf=new Refrigerator();
        rf.coolItems();
        rf.turnOn();
    }
}
