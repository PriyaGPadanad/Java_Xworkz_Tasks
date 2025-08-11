package com.xworkz.inherit.internal.currency;

public class DigitalRupee extends Currency{
    public DigitalRupee() {
        super();
        System.out.println("Running non-arg constructor DigitalRupee");
    }

    @Override
    public void value() {
        System.out.println("Digital rupee holds same value as physical--child");
    }

    @Override
    public void country() {
        System.out.println("Digital rupee is issued by Indian government--child");
    }

    @Override
    public void exchange() {
        System.out.println("Can be exchanged digitally--child");
    }

    @Override
    public void physicalForm() {
        System.out.println("No physical form, purely digital--child");
    }

    @Override
    public void store() {
        System.out.println("Stored in digital wallets--child");
    }

    public void scanAndPay() {
        System.out.println("New method scanAndPay in child class");
    }
}
