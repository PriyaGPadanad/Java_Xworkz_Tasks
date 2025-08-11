package com.xworkz.inherit.internal.cloud;

public class RainCloud extends Cloud{
    public RainCloud() {
        super();
        System.out.println("Running non-arg constructor RainCloud");
    }

    @Override
    public void form() {
        System.out.println("RainClouds are formed from saturated air--child");
    }

    @Override
    public void floatInSky() {
        System.out.println("RainClouds float lower in the sky--child");
    }

    @Override
    public void reflectLight() {
        System.out.println("RainClouds appear dark due to thickness--child");
    }

    @Override
    public void changeShape() {
        System.out.println("RainClouds change shape quickly before raining--child");
    }

    @Override
    public void type() {
        System.out.println("RainClouds are typically nimbostratus--child");
    }

    public void pourRain() {
        System.out.println("New method pourRain in child class");
    }
}
