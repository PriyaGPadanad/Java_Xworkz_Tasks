package com.xworkz.inherit.internal.camera;

public class Photographer {
    public void shoot(Camera camera){
        camera.capture();
        camera.zoom();
        camera.focus();
        camera.record();
        camera.store();

        if (camera instanceof DSLR){
            System.out.println("camera is an instance of DSLR");
            DSLR dslr=(DSLR) camera;
            dslr.changeLens();
        }
    }
}
