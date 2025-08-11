package com.xworkz.interfaceusage.ex19;

public class Bedroom {
    private AirConditioner ac;
    public Bedroom(AirConditioner ac){
        this.ac=ac;
    }
    public void startCooling(){
        ac.coolRoom();
    }
}
