package com.xworkz.interfaceusage.ex10;

public class EntertainmentCenter {
    private Television tv;
    public EntertainmentCenter(Television tv){
        this.tv=tv;
    }
    public void showContent(){
        tv.display();
    }
}
