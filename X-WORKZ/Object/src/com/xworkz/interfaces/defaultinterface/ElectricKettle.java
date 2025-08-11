package com.xworkz.interfaces.defaultinterface;

public interface ElectricKettle {
    default void boil(){
        System.out.println("ElectricKettle:Default boiling process");
    }
}
