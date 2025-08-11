package com.xworkz.exception;

import javax.sound.sampled.LineUnavailableException;
import java.security.acl.LastOwnerException;

public class EventRunner {

    public static void main(String[]args) throws LastOwnerException {

        EventCreator eventCreator=new EventCreator();
        eventCreator.checkedEvent(); //compiler check:throws  // JVM stops the execution
        eventCreator.unCheckedEvent(); //not forcing
        System.out.println("running after event in main");
    }
}
