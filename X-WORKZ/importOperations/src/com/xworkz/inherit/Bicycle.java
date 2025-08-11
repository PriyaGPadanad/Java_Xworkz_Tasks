package com.xworkz.inherit;

public class Bicycle extends Vehicle{
    public Bicycle() {
        super();
        System.out.println("Bicycle is subclass");
    }
        public void pedal(){
            System.out.println("Bicycle pedaling");
        }
        public void ringBell(){
            System.out.println("Bicycle ringing bell");
        }


    }


