package com.xworkz.inheritance.hierarchical.ex4;

public class VehicleRunner {
    public static void main(String[] args){
        Bike bike=new Bike();
        bike.ride();
        bike.fuel();

        Car car=new Car();
        car.drive();
        car.fuel();
    }
}
