package com.xworkz.inheritance.hierarchical.ex6;

public class AnimalRunner {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.breathe();
        dog.bark();

        Cat cat=new Cat();
        cat.breathe();
        cat.meow();

    }
}
