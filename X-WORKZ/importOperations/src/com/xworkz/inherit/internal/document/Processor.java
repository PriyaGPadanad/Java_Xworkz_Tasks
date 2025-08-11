package com.xworkz.inherit.internal.document;

public class Processor {
    public void process(Document document) {
        document.open();
        document.close();
        document.save();
        document.print();
        document.share();

        if (document instanceof Invoice) {
            System.out.println("document is an instance of Invoice");
            Invoice invoice = (Invoice) document;
            invoice.calculateTotal();
        }
    }
}
