package com.xworkz.interfaces.defaultinterface;

public interface ElectricGrill {
    default void grillFood(){
        System.out.println("ElectricGrill:Grilling food on default heat");
    }
}
