package com.xworkz.inherit;

public class Circle extends Shape {
    public Circle() {
        super();
        System.out.println("Circle is a subclass");
    }

    public void calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }
}
