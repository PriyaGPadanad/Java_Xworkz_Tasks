package com.xworkz.interfaces.defaultinterface;

public interface SousVide {
    default void cookSousVide(){
        System.out.println("SousVide:Cooking at consistent low temperature");
    }
}
