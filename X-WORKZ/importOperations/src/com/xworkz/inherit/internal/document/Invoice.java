package com.xworkz.inherit.internal.document;

public class Invoice extends Document{
    public Invoice() {
        super();
        System.out.println("Running non-arg constructor Invoice");
    }

    @Override
    public void open() {
        System.out.println("Opening invoice with details--child");
    }

    @Override
    public void close() {
        System.out.println("Closing the invoice safely--child");
    }

    @Override
    public void save() {
        System.out.println("Saving invoice to records--child");
    }

    @Override
    public void print() {
        System.out.println("Printing invoice for customer--child");
    }

    @Override
    public void share() {
        System.out.println("Sharing invoice via email--child");
    }

    public void calculateTotal() {
        System.out.println("New method calculateTotal in child class");
    }
}
