package com.xworkz.inherit.internal.transport;

public class Driver {
    public void drive(Transport transport) {
        transport.move();
        transport.fuelType();
        transport.capacity();
        transport.speed();
        transport.cost();

        if (transport instanceof ElectricCar) {
            System.out.println("transport is an instance of ElectricCar");
            ElectricCar car = (ElectricCar) transport;
            car.batteryStatus();
        }
    }
}
