package com.xworkz.assignment.implementation;

import com.xworkz.assignment.interfaces.Elevator;

public class OtisElevator implements Elevator {
    public void moveUp(){
        System.out.println("Otis Elevator moving up");
    }
    public void moveDown(){
        System.out.println("Otis elevator moving down");
    }
    public void stop(){
        System.out.println("Otis Elevator stopping");
    }
}
