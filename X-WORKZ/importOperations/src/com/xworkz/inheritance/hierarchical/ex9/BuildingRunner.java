package com.xworkz.inheritance.hierarchical.ex9;

public class BuildingRunner {
    public static void main(String[] args){
        School school=new School();
        school.openDoor();
        school.conductClass();

        Hospital hospital=new Hospital();
        hospital.openDoor();
        hospital.admitPatient();

    }
}
