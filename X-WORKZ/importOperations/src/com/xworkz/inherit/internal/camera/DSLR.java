package com.xworkz.inherit.internal.camera;

public class DSLR extends Camera{
    public DSLR(){
        super();
        System.out.println("Running non-arg constructor DSLR");
    }

    @Override
    public void capture(){
        System.out.println("DSLR captures high-quality images");
    }

    @Override
    public void zoom() {
        System.out.println("DSLR has optical zoom");
    }

    @Override
    public void focus() {
        System.out.println("DSLR uses audio and manual focus");
    }

    @Override
    public void record() {
        System.out.println("DSLR records HD video");
    }

    @Override
    public void store() {
        System.out.println("DSLR saves files to SD card");
    }
    public void changeLens(){
        System.out.println("new method changeLens in child class");
    }
}
