package com.xworkz.inherit.internal.instrument;

public class Flute extends instrument{
    public Flute() {
        super();
        System.out.println("Running non-arg constructor Flute");
    }

    @Override
    public void playTune() {
        System.out.println("Flute plays a melodious tune--child");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting flute air pressure for volume--child");
    }

    @Override
    public void maintain() {
        System.out.println("Cleaning and maintaining flute--child");
    }

    @Override
    public void transport() {
        System.out.println("Carrying flute in a padded case--child");
    }

    @Override
    public void store() {
        System.out.println("Storing flute in wooden box--child");
    }

    public void blow() {
        System.out.println("new method blow in child class");
    }

}
