package com.xworkz.springassignment.internal;

import org.springframework.stereotype.Component;

@Component
public class UPS {
    public void backup(){
        System.out.println("Backup power");
    }
}
