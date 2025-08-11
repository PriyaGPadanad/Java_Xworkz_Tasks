package com.xworkz.practice.q2;

public class OnlineConsultation extends Patient {
    private String doctorName;

    public OnlineConsultation(String name,int age,String doctorName){
        super(name,age);
        this.doctorName=doctorName;
    }

    @Override
    public void viewDetails(){
        super.viewDetails();
        System.out.println("Consulting Doctor:"+doctorName);
    }

}
