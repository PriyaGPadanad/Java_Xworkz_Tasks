package com.xworkz.interfaceusage.ex28;

public class Mobile {
    private Charger charger;
    public Mobile(Charger charger){
        this.charger=charger;
    }
    public void powerUp(){
        charger.charge();
    }
}
