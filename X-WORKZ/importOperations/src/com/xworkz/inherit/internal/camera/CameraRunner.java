package com.xworkz.inherit.internal.camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera1 = new Camera();
        camera1.capture();
        camera1.zoom();
        camera1.focus();
        camera1.record();
        camera1.store();

        System.out.println("-------------------");
        Camera camera2 = new DSLR();
        camera2.capture();
        camera2.zoom();
        camera2.focus();
        camera2.record();
        camera2.store();

        System.out.println("-----------------");
        DSLR dslr = new DSLR();
        dslr.capture();
        dslr.zoom();
        dslr.focus();
        dslr.record();
        dslr.store();

        System.out.println("-------casting example------------");
        Photographer photographer = new Photographer();
        photographer.shoot(camera1);
        photographer.shoot(camera2);
        photographer.shoot(dslr);
    }
}
