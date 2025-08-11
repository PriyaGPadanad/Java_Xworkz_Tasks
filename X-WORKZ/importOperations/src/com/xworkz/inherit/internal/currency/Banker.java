package com.xworkz.inherit.internal.currency;

public class Banker {
    public void transact(Currency currency) {
        currency.value();
        currency.country();
        currency.exchange();
        currency.physicalForm();
        currency.store();

        if (currency instanceof DigitalRupee) {
            System.out.println("currency is an instance of DigitalRupee");
            DigitalRupee dr = (DigitalRupee) currency;
            dr.scanAndPay();
        }
    }
}
