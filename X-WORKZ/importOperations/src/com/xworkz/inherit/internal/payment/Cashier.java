package com.xworkz.inherit.internal.payment;

public class Cashier {
    public void makePayment(Payment payment) {
        payment.initiate();
        payment.validate();
        payment.process();
        payment.confirm();
        payment.receipt();

        if (payment instanceof UpiPayment) {
            System.out.println("payment is an instance of UpiPayment");
            UpiPayment upi = (UpiPayment) payment;
            upi.scanQRCode();
        }
    }
}
