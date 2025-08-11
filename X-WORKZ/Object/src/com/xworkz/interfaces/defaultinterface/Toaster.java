package com.xworkz.interfaces.defaultinterface;

public interface Toaster {
    default void toast(){
        System.out.println("Toaster:Default toasting");
    }
}
