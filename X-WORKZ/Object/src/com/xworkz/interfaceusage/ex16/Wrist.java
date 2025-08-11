package com.xworkz.interfaceusage.ex16;

public class Wrist {
    private Watch watch;
    public Wrist(Watch watch){
        this.watch=watch;
    }
    public void checkTime(){
        watch.tick();
    }
}
