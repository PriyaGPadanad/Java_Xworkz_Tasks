package com.xworkz.inherit.internal.robot;

public class HumanoidRobot extends Robot{
    public HumanoidRobot() {
        super();
        System.out.println("Running non-arg constructor HumanoidRobot");
    }

    @Override
    public void powerOn() {
        System.out.println("Humanoid robot is powering up with AI interface--child");
    }

    @Override
    public void performTask() {
        System.out.println("Humanoid robot is performing complex human tasks--child");
    }

    @Override
    public void recharge() {
        System.out.println("Humanoid robot is wirelessly recharging--child");
    }

    @Override
    public void move() {
        System.out.println("Humanoid robot walks and navigates like a human--child");
    }

    @Override
    public void shutdown() {
        System.out.println("Humanoid robot is shutting down after task completion--child");
    }

    public void speak() {
        System.out.println("New method speak in child class");
    }
}

