package com.xworkz.inheritance.hierarchical.ex2;

public class ShapeRunner {
    public static void main(String[] args){
        Circle circle=new Circle();
        circle.drawCircle();
        circle.draw();

        Square square=new Square();
        square.drawShape();
        square.draw();
    }
}
