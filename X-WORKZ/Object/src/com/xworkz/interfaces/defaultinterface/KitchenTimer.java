package com.xworkz.interfaces.defaultinterface;

public interface KitchenTimer {
    default void setTimer() {
        System.out.println("KitchenTimer: Setting timer for default 10 minutes.");
    }
}
