package com.xworkz.practice.q2;

public class Payment {
    public void pay(int amount){
        System.out.println("Paid rs"+amount+"in cash");
    }
    public void pay(String upiId,int amount){
        System.out.println("Paid rs"+amount+"via UPI:"+upiId);
    }
}
