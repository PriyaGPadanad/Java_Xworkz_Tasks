package com.xworkz.inherit;

public class Email extends Communication{
public Email(){
    super();
    System.out.println("Email is subclass");
}
public void reply(){
    System.out.println("email replied");
}
public void forward(){
    System.out.println("email forwarded");
}
}
