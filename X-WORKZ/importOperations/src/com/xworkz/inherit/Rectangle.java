package com.xworkz.inherit;

public class Rectangle extends Shape{
    public Rectangle(){
        super();
        System.out.println("Rectangle is subclass");
    }

    public void calculateArea(){
        System.out.println("Calculating rectangle area");
    }

    public void calculatePerimeter(){
        System.out.println("Calculating rectangle perimeter");
    }
}
