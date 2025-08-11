package com.xworkz.inherit;

public class House extends Building{
    public House(){
        super();
        System.out.println("House is subclass");
    }
    public void liveIn(){
        System.out.println("House lived in");
    }
    public void garden(){
        System.out.println("House has garden");
    }
}
