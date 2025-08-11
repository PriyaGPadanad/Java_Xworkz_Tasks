package com.xworkz.inherit.internal.vehicle;

public class Driver {
    public void drive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.fuel();

        if(vehicle instanceof Car){
            System.out.println("vehicle is an instance of Car");
            Car car=(Car) vehicle;
            car.openTrunk();
        }
    }
}
