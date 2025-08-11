package com.xworkz.inherit.internal.animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.sound();
        animal1.move();
        animal1.sleep();
        animal1.eat();
        animal1.habitat();

        System.out.println("-------------------");
        Animal animal2 = new Dog();
        animal2.sound();
        animal2.move();
        animal2.sleep();
        animal2.eat();
        animal2.habitat();

        System.out.println("-----------------");
        Dog dog = new Dog();
        dog.sound();
        dog.move();
        dog.sleep();
        dog.eat();
        dog.habitat();

        System.out.println("-------casting example------------");
        Zookeeper zookeeper = new Zookeeper();
        zookeeper.manage(animal1);
        zookeeper.manage(animal2);
        zookeeper.manage(dog);
    }

}
