package com.xworkz.inherit.internal.app;

public class FitnessApp extends App{
    public FitnessApp() {
        super();
        System.out.println("Running non-arg constructor FitnessApp");
    }

    @Override
    public void launch() {
        System.out.println("Launching fitness app with splash screen--child");
    }

    @Override
    public void close() {
        System.out.println("Closing fitness app and saving data--child");
    }

    @Override
    public void update() {
        System.out.println("Updating fitness app with new workouts--child");
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending reminders to workout--child");
    }

    @Override
    public void userLogin() {
        System.out.println("User logs in to track fitness progress--child");
    }

    public void startWorkout() {
        System.out.println("New method startWorkout in child class");
    }
}
