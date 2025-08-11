package com.xworkz.Projector.internal;

public class Remote {
    Battery battery;

    public Remote() {
        battery = new Battery();
    }

    public void sendSignal() {
        System.out.println("Remote sending signal.");
    }
}
