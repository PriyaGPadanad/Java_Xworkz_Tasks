package com.xworkz.inherit;

public class NetworkDevice {
    public NetworkDevice(){
        System.out.println("NetworkDevice is superclass");
    }
    public void connect(){
        System.out.println("network device is connecting");
    }

    public void disconnect(){
        System.out.println("network device disconnected");
    }

}
