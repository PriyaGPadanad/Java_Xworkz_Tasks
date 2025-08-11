package com.xworkz.inheritance.hybrid.ex7;

public class AirForcePilot extends Human implements Pilot{
    @Override
    public void flyPlane(){
        System.out.println("AirForcePilot is flying a fighter jet");
    }
}
