package com.xworkz.interfaces.defaultinterface;

public interface InductionCooktop {
    default void heat(){
        System.out.println("InductionCooktop: Heating with default power");
    }
}
