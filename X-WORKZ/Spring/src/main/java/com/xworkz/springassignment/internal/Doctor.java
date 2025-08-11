package com.xworkz.springassignment.internal;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
    public Doctor(){
        System.out.println("Created Doctor by Spring container");
    }
}
