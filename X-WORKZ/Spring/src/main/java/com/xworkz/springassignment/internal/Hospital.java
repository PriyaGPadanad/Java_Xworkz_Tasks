package com.xworkz.springassignment.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
    @Autowired //init doctor==ref of a doctor
    private Doctor doctor;
    public Hospital(){
        System.out.println("Created Hospital using Spring container");
    }
}
