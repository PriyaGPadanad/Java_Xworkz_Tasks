package com.xworkz.interfaceusage.ex26;

public class SafetySystem {
    private Alarm alarm;
    public SafetySystem(Alarm alarm){
        this.alarm=alarm;
    }
    public void activateAlert(){
        alarm.alert();

    }
}

