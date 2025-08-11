package com.xworkz.interfaces;

public class Runner {
    public static void main(String[] args){
        Animal dog=new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();

        Vehicle car=new Car();
        car.start();
        car.accelerate();
        car.stop();

        Shape circle=new Circle();
        circle.draw();
        circle.area();
        circle.perimeter();

        Animal dogCarAnimal=new DogCar();
        Vehicle gogCarVehicle=new DogCar();
        dogCarAnimal.makeSound();
        dogCarAnimal.accelerate();

        MultifunctionalRobot robot=new MultifunctionalRobot();
        robot.work();
        robot.draw();
        robot.eat();


    }
}
