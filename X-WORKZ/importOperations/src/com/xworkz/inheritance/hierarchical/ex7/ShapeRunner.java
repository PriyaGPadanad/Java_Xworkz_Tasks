package com.xworkz.inheritance.hierarchical.ex7;

public class ShapeRunner {
    public static void main(String[] args){
        Circle circle=new Circle();
        circle.display();
        circle.drawCircle();

        Rectangle rectangle=new Rectangle();
        rectangle.display();
        rectangle.drawRectangle();
    }
}
