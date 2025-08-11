package com.xworkz.inherit.internal.document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document doc1 = new Document();
        doc1.open();
        doc1.close();
        doc1.save();
        doc1.print();
        doc1.share();

        System.out.println("-------------------");
        Document doc = new Invoice();
        doc.open();
        doc.close();
        doc.save();
        doc.print();
        doc.share();

        System.out.println("-----------------");
        Invoice invoice = new Invoice();
        invoice.open();
        invoice.close();
        invoice.save();
        invoice.print();
        invoice.share();

        System.out.println("-------casting example------------");
        Processor processor = new Processor();
        processor.process(doc1);
        processor.process(doc);
        processor.process(invoice);
    }
}
