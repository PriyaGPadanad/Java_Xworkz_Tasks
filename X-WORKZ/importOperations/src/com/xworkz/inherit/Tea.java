package com.xworkz.inherit;

public class Tea extends Drink{
    public Tea(){
        super();
        System.out.println("Tea is subclass");
    }
    public void steep(){
        System.out.println("Tea steeped");
    }
    public void addMilk(){
        System.out.println("Tea added Milk");
    }

}
