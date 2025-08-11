package com.xworkz.interfaces.defaultimpli;

public class ElectricGrinder implements coffeeGrinder{
    @Override
    public void grind(){
        System.out.println("ElectricGrinder:High-speed grinding");
    }
}
