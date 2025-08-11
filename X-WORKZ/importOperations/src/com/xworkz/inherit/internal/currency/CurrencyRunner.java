package com.xworkz.inherit.internal.currency;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency1 = new Currency();
        currency1.value();
        currency1.country();
        currency1.exchange();
        currency1.physicalForm();
        currency1.store();

        System.out.println("-------------------");
        Currency currency = new DigitalRupee();
        currency.value();
        currency.country();
        currency.exchange();
        currency.physicalForm();
        currency.store();

        System.out.println("-----------------");
        DigitalRupee digital = new DigitalRupee();
        digital.value();
        digital.country();
        digital.exchange();
        digital.physicalForm();
        digital.store();

        System.out.println("-------casting example------------");
        Banker banker = new Banker();
        banker.transact(currency1);
        banker.transact(currency);
        banker.transact(digital);
    }
}
