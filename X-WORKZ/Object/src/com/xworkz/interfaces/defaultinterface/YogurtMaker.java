package com.xworkz.interfaces.defaultinterface;

public interface YogurtMaker {
    default void ferment(){
        System.out.println("YogurtMaker:Default yogurt fermentation process");
    }

    }

