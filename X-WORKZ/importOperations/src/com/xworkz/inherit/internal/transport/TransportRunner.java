package com.xworkz.inherit.internal.transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport t1 = new Transport();
        t1.move();
        t1.fuelType();
        t1.capacity();
        t1.speed();
        t1.cost();

        System.out.println("-------------------");
        Transport t = new ElectricCar();
        t.move();
        t.fuelType();
        t.capacity();
        t.speed();
        t.cost();

        System.out.println("-----------------");
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.fuelType();
        electricCar.capacity();
        electricCar.speed();
        electricCar.cost();

        System.out.println("-------casting example------------");
        Driver driver = new Driver();
        driver.drive(t1);
        driver.drive(t);
        driver.drive(electricCar);
    }
}
