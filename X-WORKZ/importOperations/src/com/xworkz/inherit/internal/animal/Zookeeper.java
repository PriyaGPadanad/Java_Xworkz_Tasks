package com.xworkz.inherit.internal.animal;

public class Zookeeper {
    public void manage(Animal animal) {
        animal.sound();
        animal.move();
        animal.sleep();
        animal.eat();
        animal.habitat();

        if(animal instanceof Dog) {
            System.out.println("animal is an instance of Dog");
            Dog dog = (Dog) animal;
            dog.guardHouse();
        }
    }
}
