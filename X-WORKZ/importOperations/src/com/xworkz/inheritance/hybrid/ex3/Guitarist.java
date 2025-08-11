package com.xworkz.inheritance.hybrid.ex3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Guitarist extends Person implements Musician{
    @Override
    public void playInstrument(){
        System.out.println("Guitarist is playing a guitar");
    }

}
