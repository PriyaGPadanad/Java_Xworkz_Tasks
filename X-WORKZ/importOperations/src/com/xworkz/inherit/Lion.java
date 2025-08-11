package com.xworkz.inherit;

public class Lion extends Animal{
    public Lion() {
        super();
        System.out.println("Lion is subclass");
    }
    public void roar() {
        System.out.println("Lion roaring");
    }
    public void hunt() {
        System.out.println("Lion hunting");
    }
}
