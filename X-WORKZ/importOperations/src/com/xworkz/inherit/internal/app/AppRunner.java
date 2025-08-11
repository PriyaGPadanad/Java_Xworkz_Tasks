package com.xworkz.inherit.internal.app;

public class AppRunner {
    public static void main(String[] args) {
        App app1 = new App();
        app1.launch();
        app1.close();
        app1.update();
        app1.notifyUser();
        app1.userLogin();

        System.out.println("-------------------");
        App app = new FitnessApp();
        app.launch();
        app.close();
        app.update();
        app.notifyUser();
        app.userLogin();

        System.out.println("-----------------");
        FitnessApp fitness = new FitnessApp();
        fitness.launch();
        fitness.close();
        fitness.update();
        fitness.notifyUser();
        fitness.userLogin();

        System.out.println("-------casting example------------");
        MobileDevice mobile = new MobileDevice();
        mobile.run(app1);
        mobile.run(app);
        mobile.run(fitness);
    }
}
