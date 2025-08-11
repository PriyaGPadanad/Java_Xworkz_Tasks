package com.xworkz.practice.q2;

public class Main {
    public static void main(String[] args) {
        OnlineConsultation consult=new OnlineConsultation("Priya",22,"Dr.rao");
        consult.viewDetails();

        Payment payment=new Payment();
        payment.pay(500);
        payment.pay("priya@upi",700);
    }
}
