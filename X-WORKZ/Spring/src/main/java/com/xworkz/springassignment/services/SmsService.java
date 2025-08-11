package com.xworkz.springassignment.services;

import org.springframework.stereotype.Component;

@Component
public class SmsService {
    public void sendSms(){
        System.out.println("Sending SMS");
    }
}
