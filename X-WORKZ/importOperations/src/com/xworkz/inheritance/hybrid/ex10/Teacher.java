package com.xworkz.inheritance.hybrid.ex10;

public class Teacher extends Person implements Speaker{
    @Override
    public void speak(){
        System.out.println("Teacher is speaking to students");
    }
}
