package com.xworkz.inherit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Tennis extends Sport{
    public Tennis(){
        super();
        System.out.println("Tennis is subclass");
    }
    public void serve(){
        System.out.println("Tennis served");
    }
    public void volley(){
        System.out.println("Tennis volleyed");
    }


}
