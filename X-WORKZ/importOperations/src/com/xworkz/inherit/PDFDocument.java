package com.xworkz.inherit;

public class PDFDocument extends Document{
    public PDFDocument(){
        super();
        System.out.println("PDF Document is subclass");
    }
    public void render() {
        System.out.println("Rendering PDF");
    }
}
