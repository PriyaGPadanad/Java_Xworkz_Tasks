package com.xworkz.assignment.implementation;

import com.xworkz.assignment.interfaces.WashingMachine;

public class SamsungWasher implements WashingMachine {
    public void wash(){
        System.out.println("Samsung washer washing clothes");
    }
    public void rinse(){
        System.out.println("Samsung washer rinsing");
    }
    public void spin(){
        System.out.println("Samsung washer spinning");
    }
}
