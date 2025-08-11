package com.xworkz.interfaceusage.ex30;

public class School {
    private Bell bell;
    public School(Bell bell){
        this.bell=bell;

    }
    public void startPeriod(){
        bell.ring();
    }
}
