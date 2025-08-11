package com.xworkz.inherit;

public class Triangle extends Shape{
    public Triangle(){
        super();
        System.out.println("Triangle is subclass");
    }
    public void draw(){
        System.out.println("Triangle is drawn");
    }
    public void remove(){
        System.out.println("triangle is removed");
    }
}
