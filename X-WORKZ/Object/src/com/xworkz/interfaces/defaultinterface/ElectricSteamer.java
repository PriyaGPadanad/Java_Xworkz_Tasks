package com.xworkz.interfaces.defaultinterface;

public interface ElectricSteamer {
    default void steam(){
        System.out.println("ElectricSteamer:Steaming food at default temperature");
    }
}
