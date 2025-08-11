package com.xworkz.inherit.internal.cloud;

public class Meteorologist {
    public void observe(Cloud cloud) {
        cloud.form();
        cloud.floatInSky();
        cloud.reflectLight();
        cloud.changeShape();
        cloud.type();

        if (cloud instanceof RainCloud) {
            System.out.println("cloud is an instance of RainCloud");
            RainCloud rc = (RainCloud) cloud;
            rc.pourRain();
        }
    }
}
