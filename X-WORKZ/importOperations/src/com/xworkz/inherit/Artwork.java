package com.xworkz.inherit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Artwork {
    public Artwork(){
        System.out.println("Artwork is superclass");
    }
    public void create(){
        System.out.println("Artwork created");
    }
    public void display(){
        System.out.println("Artwork displayed");
    }
}
