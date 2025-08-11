package com.xworkz.inherit.internal.payment;

public class Payment {
    public void initiate() {
        System.out.println("Initiating payment--parent");
    }
    public void validate() {
        System.out.println("Validating payment--parent");
    }
    public void process() {
        System.out.println("Processing payment--parent");
    }
    public void confirm() {
        System.out.println("Confirming payment--parent");
    }
    public void receipt() {
        System.out.println("Generating payment receipt--parent");
    }
}
