package com.xworkz.inherit.internal.bird;

public class Parrot extends Bird{
    public Parrot() {
        super();
        System.out.println("Running non-arg constructor Parrot");
    }

    @Override
    public void fly() {
        System.out.println("Parrot flies short distances--child");
    }

    @Override
    public void eat() {
        System.out.println("Parrot loves eating fruits and seeds--child");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot sleeps on tree branches--child");
    }

    @Override
    public void sing() {
        System.out.println("Parrot mimics human speech--child");
    }

    @Override
    public void migrate() {
        System.out.println("Parrot usually does not migrate--child");
    }

    public void talk() {
        System.out.println("new method talk in child class");
    }
}
