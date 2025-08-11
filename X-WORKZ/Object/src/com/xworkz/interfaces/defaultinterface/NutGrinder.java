package com.xworkz.interfaces.defaultinterface;

public interface NutGrinder {
    default void grindNuts(){
        System.out.println("NutGrinder:Grinding nuts normally");
    }
}
