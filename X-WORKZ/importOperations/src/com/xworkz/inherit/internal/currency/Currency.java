package com.xworkz.inherit.internal.currency;

public class Currency {
    public void value() {
        System.out.println("Showing currency value--parent");
    }
    public void country() {
        System.out.println("Currency belongs to a country--parent");
    }
    public void exchange() {
        System.out.println("Currency can be exchanged--parent");
    }
    public void physicalForm() {
        System.out.println("Currency is in physical form--parent");
    }
    public void store() {
        System.out.println("Storing currency in wallet--parent");
    }
}
