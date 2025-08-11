package com.xworkz.interfaces.defaultinterface;

public interface KitchenScale {
    default void weigh() {
        System.out.println("KitchenScale: Weighing ingredients in grams.");
    }
}
