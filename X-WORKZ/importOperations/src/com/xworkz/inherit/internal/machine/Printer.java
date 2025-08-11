package com.xworkz.inherit.internal.machine;

public class Printer extends Machine{
    public Printer() {
        super();
        System.out.println("Running non-arg constructor Printer");
    }

    @Override
    public void start() {
        System.out.println("Printer warming up--child");
    }

    @Override
    public void stop() {
        System.out.println("Printer shutting down--child");
    }

    @Override
    public void run() {
        System.out.println("Printer printing documents--child");
    }

    @Override
    public void performTask() {
        System.out.println("Printer prints, scans, and copies--child");
    }

    @Override
    public void consumeEnergy() {
        System.out.println("Printer uses moderate power--child");
    }

    public void refillInk() {
        System.out.println("new method refillInk in child class");
    }
}
