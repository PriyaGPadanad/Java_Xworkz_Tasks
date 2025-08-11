package com.xworkz.inherit.internal.bird;

public class Ornithologist {
    public void observe(Bird bird) {
        bird.fly();
        bird.eat();
        bird.sleep();
        bird.sing();
        bird.migrate();

        if(bird instanceof Parrot) {
            System.out.println("bird is an instance of Parrot");
            Parrot parrot = (Parrot) bird;
            parrot.talk();
        }
    }
}
