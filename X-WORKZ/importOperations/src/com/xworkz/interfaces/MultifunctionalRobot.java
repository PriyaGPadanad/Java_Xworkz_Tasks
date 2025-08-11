package com.xworkz.interfaces;

public class MultifunctionalRobot implements Animal,Vehicle,Shape,Electronics,Worker{
    @Override
    public void eat(){
        System.out.println("Robot recharges");
    }
    @Override
    public void sleep(){
        System.out.println("Robot in sleep mode");
    }
    @Override
    public void makeSound(){
        System.out.println("Robot beeps");
    }
    @Override
    public void start(){
        System.out.println("Robot starts working");
    }
    @Override
    public void stop(){
        System.out.println("Robot stops");
    }
    @Override
    public void accelerate(){
        System.out.println("robot increases speed");
    }
    @Override
    public void draw(){
        System.out.println("Robot draws patterns");
    }
    @Override
    public void area(){
        System.out.println("Robot calculates area");
    }
    @Override
    public void perimeter(){
        System.out.println("robot calculates perimeter");
    }
    @Override
    public void powerOn(){
        System.out.println("Robot powered on");
    }
    @Override
    public void powerOff(){
        System.out.println("Robot powered off");
    }
    @Override
    public void work(){
        System.out.println("Robot working efficiently");
    }
}
