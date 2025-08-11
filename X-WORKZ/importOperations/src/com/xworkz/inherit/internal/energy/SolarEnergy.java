package com.xworkz.inherit.internal.energy;

public class SolarEnergy extends Energy{
    public SolarEnergy(){
        super();
        System.out.println("Running non-arg constructor solarEnergy");
    }
    @Override
    public void generate(){
        System.out.println("generating energy from sunlight");
    }
    @Override
    public void store(){
        System.out.println("storing solar energy via solar grids");
    }
    @Override
    public void transmit(){
        System.out.println("Transmitting solar energy via solar grids");
    }
    @Override
    public void convert(){
        System.out.println("Converting sunlight into electrical energy");
    }
    @Override
    public void consume(){
        System.out.println("Consuming solar energy for household and industrial use");
    }
    public void trackSunlight(){
        System.out.println("New method trackSunlight in child class");
    }
}
