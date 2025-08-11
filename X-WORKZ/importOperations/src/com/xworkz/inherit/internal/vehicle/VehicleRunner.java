package com.xworkz.inherit.internal.vehicle;

public class VehicleRunner {
    public static void main(String[] args){
        Vehicle vehicle1=new Vehicle();
        vehicle1.start();
        vehicle1.stop();
        vehicle1.accelerate();
        vehicle1.brake();
        vehicle1.fuel();

        System.out.println("----------");
        Vehicle vehicle2=new Car();
        vehicle2.start();
        vehicle2.stop();
        vehicle2.accelerate();
        vehicle2.brake();
        vehicle2.fuel();

        System.out.println("---------");
        Car car=new Car();
        car.start();
        car.stop();
        car.accelerate();
        car.brake();
        car.fuel();

        System.out.println("---casting example----");
        Driver driver=new Driver();
        driver.drive(vehicle1);
        driver.drive(vehicle2);
        driver.drive(car);


    }
}
