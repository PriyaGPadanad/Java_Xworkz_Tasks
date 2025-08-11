package com.xworkz.interfaces.defaultinterface;

public interface ButterChurner {
    default void churn() {
        System.out.println("ButterChurner: Churning butter traditionally.");
    }
}
