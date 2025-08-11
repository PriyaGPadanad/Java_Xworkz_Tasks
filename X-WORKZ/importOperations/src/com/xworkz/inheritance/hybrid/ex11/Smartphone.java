package com.xworkz.inheritance.hybrid.ex11;

public class Smartphone extends Device implements CameraEnabled{
    @Override
    public void takePhoto(){
        System.out.println("Smartphone is taking a photo");
    }

}
