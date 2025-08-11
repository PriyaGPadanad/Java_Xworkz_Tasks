package com.xworkz.inherit;

public class Flower extends Plant{
    public Flower(){
        super();
        System.out.println("Flower is subclass");
    }
    public void bloom(){
        System.out.println("Flower blooming");
    }
    public void produceScent(){
        System.out.println("Flower producing scent");
    }
}
