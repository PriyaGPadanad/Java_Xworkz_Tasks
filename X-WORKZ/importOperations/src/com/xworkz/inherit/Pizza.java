package com.xworkz.inherit;

public class Pizza extends Food{
    public Pizza(){
        super();
        System.out.println("Pizza is superclass");
    }
    public void addCheese(){
        System.out.println("Adding cheese to pizza");
    }

    public void bake(){
        System.out.println("Baking pizza");
    }
}
