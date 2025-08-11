package com.xworkz.interfaceusage.ex6;

public class Office {
    private Printer printer;
    public Office(Printer printer){
        this.printer=printer;
    }
    public void startPrinting(){
        printer.print();
    }
}
