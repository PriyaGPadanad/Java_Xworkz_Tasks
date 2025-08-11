package com.xworkz.interfaceusage.ex11;

public class Hall {
    private Fan fan;
    public Hall(Fan fan){
        this.fan=fan;
    }
    public void coolRoom(){
        fan.rotate();
    }
}
