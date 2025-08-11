package com.xworkz.inheritance.hybrid.ex4;

public class CabDriver extends Employee implements Driver{
    @Override
    public void drive(){
        System.out.println("CabDriver is driving a car");
    }
}
