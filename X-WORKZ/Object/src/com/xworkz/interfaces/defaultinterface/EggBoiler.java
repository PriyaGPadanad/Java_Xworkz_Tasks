package com.xworkz.interfaces.defaultinterface;

public interface EggBoiler {
    default void boilEggs(){
        System.out.println("Eggboiler:Default boiling eggs");
    }
}
