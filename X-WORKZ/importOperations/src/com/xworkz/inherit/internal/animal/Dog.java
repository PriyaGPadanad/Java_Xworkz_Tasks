package com.xworkz.inherit.internal.animal;

public class Dog extends Animal{


    public Dog() {
        super();
        System.out.println("Running non-arg constructor Dog");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks--child");
    }

    @Override
    public void move() {
        System.out.println("Dog runs on four legs--child");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in a kennel--child");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones and meat--child");
    }

    @Override
    public void habitat() {
        System.out.println("Dog lives with humans--child");
    }

    public void guardHouse() {
        System.out.println("new method guardHouse in child class");
    }
}