package com.xworkz.inherit.internal.payment;

public class UpiPayment extends Payment{
    public UpiPayment() {
        super();
        System.out.println("Running non-arg constructor UpiPayment");
    }

    @Override
    public void initiate() {
        System.out.println("Initiating UPI payment--child");
    }

    @Override
    public void validate() {
        System.out.println("Validating UPI ID and PIN--child");
    }

    @Override
    public void process() {
        System.out.println("Processing UPI transaction--child");
    }

    @Override
    public void confirm() {
        System.out.println("Confirming UPI payment--child");
    }

    @Override
    public void receipt() {
        System.out.println("Sending UPI payment receipt to mobile--child");
    }

    public void scanQRCode() {
        System.out.println("New method scanQRCode in child class");
    }
}
