package com.xworkz.inherit.internal.cloud;

public class CloudRunner {
    public static void main(String[] args) {
        Cloud cloud1 = new Cloud();
        cloud1.form();
        cloud1.floatInSky();
        cloud1.reflectLight();
        cloud1.changeShape();
        cloud1.type();

        System.out.println("-------------------");
        Cloud cloud = new RainCloud();
        cloud.form();
        cloud.floatInSky();
        cloud.reflectLight();
        cloud.changeShape();
        cloud.type();

        System.out.println("-----------------");
        RainCloud rainCloud = new RainCloud();
        rainCloud.form();
        rainCloud.floatInSky();
        rainCloud.reflectLight();
        rainCloud.changeShape();
        rainCloud.type();

        System.out.println("-------casting example------------");
        Meteorologist meteorologist = new Meteorologist();
        meteorologist.observe(cloud1);
        meteorologist.observe(cloud);
        meteorologist.observe(rainCloud);
    }
}
