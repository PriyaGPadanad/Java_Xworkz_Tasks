package com.xworkz.interfaceusage.ex8;

public class Photographer {
    private Camera camera;
    public Photographer(Camera camera){
        this.camera=camera;
    }
    public void takePhoto(){
        camera.capture();
    }
}
