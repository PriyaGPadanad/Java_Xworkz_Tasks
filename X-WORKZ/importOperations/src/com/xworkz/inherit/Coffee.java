package com.xworkz.inherit;

public class Coffee extends Drink{
    public Coffee(){
        super();
        System.out.println("Coffee is subclass");
    }
    public void addMilk(){
        System.out.println("Coffee with milk added");
    }
    public void addSugar(){
        System.out.println("Coffee with sugar added");
    }


}
