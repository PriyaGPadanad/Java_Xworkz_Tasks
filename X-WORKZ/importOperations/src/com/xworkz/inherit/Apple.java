package com.xworkz.inherit;

public class Apple extends Fruit{
    public Apple(){
        super();
        System.out.println("Apple is subclass");
    }
    public void peel(){
        System.out.println("Apple peeled");
    }
    public void slice(){
        System.out.println("Apple sliced");
    }

}
