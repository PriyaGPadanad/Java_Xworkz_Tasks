package com.xworkz.inherit.internal.machine;

public class Operator {
    public void operate(Machine machine) {
        machine.start();
        machine.stop();
        machine.run();
        machine.performTask();
        machine.consumeEnergy();

        if(machine instanceof Printer) {
            System.out.println("machine is an instance of Printer");
            Printer printer = (Printer) machine;
            printer.refillInk();
        }
    }
}
