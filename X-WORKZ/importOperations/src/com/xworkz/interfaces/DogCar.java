package com.xworkz.interfaces;

public class DogCar implements Animal,Vehicle{
    @Override
    public void eat(){
        System.out.println("DogCar eats electricity");
    }
    @Override
    public void sleep(){
        System.out.println("DogCar is parked");
    }
    @Override
    public void makeSound(){
        System.out.println("DogCar barks and honks");
    }

    @Override
    public void start(){
        System.out.println("DogCar starts");
    }
    @Override
    public void stop(){
        System.out.println("DogCar stops");
    }
    @Override
    public void accelerate(){
        System.out.println("DogCar accelerates");
    }
}
