package com.xworkz.assignment.implementation;

import com.xworkz.assignment.interfaces.Heater;

public class BajajHeater implements Heater {
    public void turnOn(){
        System.out.println("Bajaj Heater turned on");
    }
    public void turnOff(){
        System.out.println("Bajaj Heater turned off");
    }
    public void setTemperature(){
        System.out.println("Bajaj Heater setting temperature");
    }
    }

