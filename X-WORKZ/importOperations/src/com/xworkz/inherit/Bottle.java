package com.xworkz.inherit;

public class Bottle extends Container{
    public Bottle(){
        super();
        System.out.println("Bottle is subclass");
    }
    public void seal(){
        System.out.println("Bottle sealed");
    }
    public void pour(){
        System.out.println("Bottle poured");
    }




}
