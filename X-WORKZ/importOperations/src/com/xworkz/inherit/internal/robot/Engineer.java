package com.xworkz.inherit.internal.robot;

public class Engineer {
    public void test(Robot robot) {
        robot.powerOn();
        robot.performTask();
        robot.recharge();
        robot.move();
        robot.shutdown();

        if (robot instanceof HumanoidRobot) {
            System.out.println("robot is an instance of HumanoidRobot");
            HumanoidRobot humanoid = (HumanoidRobot) robot;
            humanoid.speak();
        }
    }
}
