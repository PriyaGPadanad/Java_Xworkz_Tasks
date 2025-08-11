package com.xworkz.practice.q2;


    public class Patient {
        private String name;
        private int age;
        public Patient(String name,int age){
            this.name=name;
            this.age=age;
        }
        public void viewDetails(){
            System.out.println("Patient:"+name+",Age:"+age);
        }
    }




