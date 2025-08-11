package com.xworkz.inherit;

public class Guitar extends Instrument{
    public Guitar(){
        super();
        System.out.println("Guitar is subclass");
    }
    public void strum(){
        System.out.println("Guitar strumming");
    }
    public void pick(){
        System.out.println("Guitar picking");
    }
}
