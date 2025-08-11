package com.xworkz.interfaceusage.ex13;

public class Wall {
    private Clock clock;
    public Wall(Clock clock){
        this.clock=clock;
    }
    public void displayTime(){
        clock.showTime();
    }
}
