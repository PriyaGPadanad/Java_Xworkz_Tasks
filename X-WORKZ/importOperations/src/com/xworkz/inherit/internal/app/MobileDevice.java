package com.xworkz.inherit.internal.app;

public class MobileDevice {
    public void run(App app) {
        app.launch();
        app.close();
        app.update();
        app.notifyUser();
        app.userLogin();

        if (app instanceof FitnessApp) {
            System.out.println("app is an instance of FitnessApp");
            FitnessApp fit = (FitnessApp) app;
            fit.startWorkout();
        }
    }
}
