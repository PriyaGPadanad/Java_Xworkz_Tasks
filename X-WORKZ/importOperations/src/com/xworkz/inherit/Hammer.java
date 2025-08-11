package com.xworkz.inherit;

public class Hammer extends Tool{
    public Hammer(){
        super();
        System.out.println("Hammer is subclass");
    }
    public void strike(){
        System.out.println("Hammer striking");
    }
    public void pullNails(){
        System.out.println("Hammer pulling nails");
    }
}
