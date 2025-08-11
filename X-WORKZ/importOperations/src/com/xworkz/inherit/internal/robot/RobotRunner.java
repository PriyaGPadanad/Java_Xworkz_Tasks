package com.xworkz.inherit.internal.robot;

public class RobotRunner {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        r1.powerOn();
        r1.performTask();
        r1.recharge();
        r1.move();
        r1.shutdown();

        System.out.println("-------------------");
        Robot r = new HumanoidRobot();
        r.powerOn();
        r.performTask();
        r.recharge();
        r.move();
        r.shutdown();

        System.out.println("-----------------");
        HumanoidRobot humanoid = new HumanoidRobot();
        humanoid.powerOn();
        humanoid.performTask();
        humanoid.recharge();
        humanoid.move();
        humanoid.shutdown();

        System.out.println("-------casting example------------");
        Engineer engineer = new Engineer();
        engineer.test(r1);
        engineer.test(r);
        engineer.test(humanoid);
    }
}
