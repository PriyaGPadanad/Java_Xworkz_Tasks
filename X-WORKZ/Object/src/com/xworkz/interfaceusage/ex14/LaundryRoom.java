package com.xworkz.interfaceusage.ex14;

public class LaundryRoom {
    private WashingMachine washer;
    public LaundryRoom(WashingMachine washer){
        this.washer=washer;
    }
    public void doLaundry(){
        washer.wash();
    }
}
