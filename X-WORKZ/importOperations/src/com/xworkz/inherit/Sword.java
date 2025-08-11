package com.xworkz.inherit;

public class Sword extends Weapon{
    public Sword(){
        super();
        System.out.println("Sword is subclass");
    }
    public void slash(){
        System.out.println("sword slashing");
    }
    public void thrust(){
        System.out.println("sword thrusting");
    }

}
