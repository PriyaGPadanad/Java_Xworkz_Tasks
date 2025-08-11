package com.xworkz.interfaces.defaultimpli;

public class SmartEggBoiler implements EggBoiler{
    @Override
    public void boilEggs(){
        System.out.println("SmartEggBoiler:Boiling eggs with soft/hard options");
    }
}
