package com.xworkz.interfaceusage.ex22;

public class Shower {
    private Heater heater;
    public Shower (Heater heater){
        this.heater=heater;
    }
    public void startHeating(){
        heater.heat();
    }
}
