package com.xworkz.interfaces.defaultinterface;

public interface ElectricPeeler {
    default void peel(){
        System.out.println("ElectricPeeler:Default peeling operation");
    }
}
