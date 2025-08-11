package com.xworkz.interfaces;

public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
    @Override
    public void area(){
        System.out.println("Calculating area of circle");
    }
    @Override
    public void perimeter(){
        System.out.println("Calculating perimeter of circle");
    }
}
