package com.xworkz.inherit;

public class Wrench extends Tool{
    public Wrench(){
        super();
        System.out.println("Wrench is subclass");
    }
    public void tightenBolt(){
        System.out.println("Wrench tightened bolt");
    }
    public void loosenNut(){
        System.out.println("Wrench loosened nut");
    }

}
