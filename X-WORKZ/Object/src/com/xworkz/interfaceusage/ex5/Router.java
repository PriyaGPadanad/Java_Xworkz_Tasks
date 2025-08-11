package com.xworkz.interfaceusage.ex5;

public class Router {
    private Network network;
    public Router(Network network){
        this.network=network;
    }
    public void establishConnection(){
        network.connect();
    }
}
