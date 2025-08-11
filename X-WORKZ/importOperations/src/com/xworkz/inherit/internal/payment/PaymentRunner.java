package com.xworkz.inherit.internal.payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment p1 = new Payment();
        p1.initiate();
        p1.validate();
        p1.process();
        p1.confirm();
        p1.receipt();

        System.out.println("-------------------");
        Payment p = new UpiPayment();
        p.initiate();
        p.validate();
        p.process();
        p.confirm();
        p.receipt();

        System.out.println("-----------------");
        UpiPayment upiPayment = new UpiPayment();
        upiPayment.initiate();
        upiPayment.validate();
        upiPayment.process();
        upiPayment.confirm();
        upiPayment.receipt();

        System.out.println("-------casting example------------");
        Cashier cashier = new Cashier();
        cashier.makePayment(p1);
        cashier.makePayment(p);
        cashier.makePayment(upiPayment);
    }
}
