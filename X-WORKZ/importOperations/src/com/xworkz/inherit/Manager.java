package com.xworkz.inherit;

public class Manager extends Employee{

    public Manager(){
        super();
        System.out.println("Manager is superclass");
    }

    public void manageTeam(){
        System.out.println("Manager manages team");
    }

    public void conductMeeting(){
        System.out.println("manager conducts meeting");
    }
}
