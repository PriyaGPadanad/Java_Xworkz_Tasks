package com.xworkz.inherit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Television extends ElectronicDevice{
    public Television(){
        super();
        System.out.println("Television is subclass");
    }

    public void changeChannel(){
        System.out.println("Television channel changed");
    }

    public void adjustVolume(){
        System.out.println("Television volume adjusted");
    }
}
