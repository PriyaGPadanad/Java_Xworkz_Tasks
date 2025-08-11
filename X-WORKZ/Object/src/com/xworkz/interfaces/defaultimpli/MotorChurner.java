package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ButterChurner;

public class MotorChurner implements ButterChurner {
    @Override
    public void churn() {
        System.out.println("MotorChurner: Churning butter using electric motor.");
    }
}
