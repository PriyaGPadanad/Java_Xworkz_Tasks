package com.xworkz.assignment.implementation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DJIDrone implements Drone{
    public void fly(){
        System.out.println("DIJ Drone flying");
    }
    public void capture(){
        System.out.println("DJI drone capturing video");
    }
    public void land(){
        System.out.println("DJI Drone landing");
    }

}
