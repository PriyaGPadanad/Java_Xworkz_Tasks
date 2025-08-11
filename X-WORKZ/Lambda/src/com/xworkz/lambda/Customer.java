package com.xworkz.lambda;

public class Customer {
    public void buy(Bottle bottle){
        boolean value=bottle.test(3);
        System.out.println(value);
    }
}
