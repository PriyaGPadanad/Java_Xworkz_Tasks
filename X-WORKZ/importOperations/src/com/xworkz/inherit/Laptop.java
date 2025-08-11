package com.xworkz.inherit;

public class Laptop extends Computer{
    public Laptop(){
        super();
        System.out.println("Laptop is subclass");
    }
    public void portability(){
        System.out.println("Laptop is portable");
    }
    public void batteryLife(){
        System.out.println("Laptop battery life");
    }


}
