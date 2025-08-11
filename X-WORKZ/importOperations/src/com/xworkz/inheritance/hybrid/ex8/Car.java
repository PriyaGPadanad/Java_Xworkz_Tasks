package com.xworkz.inheritance.hybrid.ex8;

public class Car extends Machine implements Drivable{
    @Override
    public void drive(){
        System.out.println("Car is being driven");
    }
}
