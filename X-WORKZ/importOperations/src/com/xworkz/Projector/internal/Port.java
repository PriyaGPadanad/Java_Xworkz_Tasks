package com.xworkz.Projector.internal;

public class Port {
    PortType type;

    public Port() {
        type = PortType.HDMI; // Example initialization
    }

    public void connectDevice() {
        System.out.println("Device connected to port.");
    }
}
