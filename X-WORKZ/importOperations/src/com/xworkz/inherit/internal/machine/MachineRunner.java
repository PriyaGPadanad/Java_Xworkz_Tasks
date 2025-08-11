package com.xworkz.inherit.internal.machine;

public class MachineRunner {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.start();
        m1.stop();
        m1.run();
        m1.performTask();
        m1.consumeEnergy();

        System.out.println("-------------------");
        Machine m2 = new Printer();
        m2.start();
        m2.stop();
        m2.run();
        m2.performTask();
        m2.consumeEnergy();

        System.out.println("-----------------");
        Printer printer = new Printer();
        printer.start();
        printer.stop();
        printer.run();
        printer.performTask();
        printer.consumeEnergy();

        System.out.println("-------casting example------------");
        Operator operator = new Operator();
        operator.operate(m1);
        operator.operate(m2);
        operator.operate(printer);
    }
}
