package com.xworkz.inherit;

public class Student extends Person{
    public Student() {
        super();
        System.out.println("Student is subclass");
    }
    public void study() {
        System.out.println("Student studying");
    }
    public void attendClass() {
        System.out.println("Student attending class");
    }

}
