package com.xworkz.springassignment.services;

import org.springframework.stereotype.Component;

@Component
public class AuthService {
    public void authenticate(){
        System.out.println("Authenticating user");
    }
}
