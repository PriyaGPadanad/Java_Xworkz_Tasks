package com.xworkz.inheritance.hierarchical.ex1;

import com.xworkz.inheritance.hierarchical.ex1.Cat;
import com.xworkz.inheritance.hierarchical.ex1.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breathe();
        cat.meow();

        Dog dog = new Dog();
        dog.breathe();
        dog.bark();
    }
}
