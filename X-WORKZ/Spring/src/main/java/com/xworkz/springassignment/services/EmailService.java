package com.xworkz.springassignment.services;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public void sendEmail(){
        System.out.println("Sending Email");
    }
}
