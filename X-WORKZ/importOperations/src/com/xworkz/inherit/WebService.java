package com.xworkz.inherit;

public class WebService extends Service{
    public WebService() {
        super();
    }
    public void handleRequest() {
        System.out.println("Handling web request");
    }
}
