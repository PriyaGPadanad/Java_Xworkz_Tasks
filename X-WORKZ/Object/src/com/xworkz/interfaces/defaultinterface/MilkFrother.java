package com.xworkz.interfaces.defaultinterface;

public interface MilkFrother {
    default void froth(){
        System.out.println("MilkFrother:Frothing milk by default");
    }
}
