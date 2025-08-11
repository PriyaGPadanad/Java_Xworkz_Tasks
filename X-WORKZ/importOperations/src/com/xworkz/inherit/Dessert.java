package com.xworkz.inherit;

public class Dessert extends Food{
    public Dessert(){
        super();
        System.out.println("Desert is subclass");
    }
    public void sweeten(){
        System.out.println("Desert sweetened");
    }
    public void chill(){
        System.out.println("Dessert chilled ");
    }

}
