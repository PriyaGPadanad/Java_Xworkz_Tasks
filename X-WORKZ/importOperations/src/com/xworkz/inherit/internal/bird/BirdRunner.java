package com.xworkz.inherit.internal.bird;

public class BirdRunner {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.fly();
        b1.eat();
        b1.sleep();
        b1.sing();
        b1.migrate();

        System.out.println("-------------------");
        Bird b2 = new Parrot();
        b2.fly();
        b2.eat();
        b2.sleep();
        b2.sing();
        b2.migrate();

        System.out.println("-----------------");
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.eat();
        parrot.sleep();
        parrot.sing();
        parrot.migrate();

        System.out.println("-------casting example------------");
        Ornithologist ornithologist = new Ornithologist();
        ornithologist.observe(b1);
        ornithologist.observe(b2);
        ornithologist.observe(parrot);
    }
}
