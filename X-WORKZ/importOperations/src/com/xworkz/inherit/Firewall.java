package com.xworkz.inherit;

public class Firewall extends NetworkComponent{
    public Firewall() {
        super();
    }
    public void blockTraffic() {
        System.out.println("Blocking traffic");
    }
}
