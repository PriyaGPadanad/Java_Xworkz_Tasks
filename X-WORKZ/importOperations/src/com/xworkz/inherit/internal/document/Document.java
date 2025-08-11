package com.xworkz.inherit.internal.document;

public class Document {
    public void open() {
        System.out.println("Opening document--parent");
    }
    public void close() {
        System.out.println("Closing document--parent");
    }
    public void save() {
        System.out.println("Saving document--parent");
    }
    public void print() {
        System.out.println("Printing document--parent");
    }
    public void share() {
        System.out.println("Sharing document--parent");
    }
}
