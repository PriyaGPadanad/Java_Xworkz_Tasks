package com.xworkz.assignment.implementation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworkz.assignment.interfaces.SmartWatch;
public class Fitbit implements SmartWatch{
    public void showTime(){
        System.out.println("Fitbit showing time");
    }
    public void trackSteps(){
        System.out.println("Fitbit tracking steps");
    }
    public void monitorHeartRate(){
        System.out.println("Fitbit  monitoring heart rate");
    }

}
