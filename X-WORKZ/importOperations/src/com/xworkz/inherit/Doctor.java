package com.xworkz.inherit;

public class Doctor extends Profession{
    public Doctor(){
        super();
        System.out.println("Doctor is subclass");
    }
    public void diagnose(){
        System.out.println("Doctor diagnosing");
    }
    public void prescribe(){
        System.out.println("Doctor prescribing");
    }
}
