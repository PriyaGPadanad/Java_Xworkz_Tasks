package com.xworkz.interfaceusage.ex7;

public class Room {
    private Light light;
    public Room(Light light){
        this.light=light;
    }
    public void illuminate(){
        light.turnOn();
    }
}
