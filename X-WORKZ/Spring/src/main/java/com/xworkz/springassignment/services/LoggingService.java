package com.xworkz.springassignment.services;

import org.springframework.stereotype.Component;

@Component
public class LoggingService {
    public void log(){
        System.out.println("Logging activity");
    }
}
