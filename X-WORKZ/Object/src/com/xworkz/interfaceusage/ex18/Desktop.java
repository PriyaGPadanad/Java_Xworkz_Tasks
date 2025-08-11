package com.xworkz.interfaceusage.ex18;

public class Desktop {
    private Mouse mouse;
    public Desktop(Mouse mouse){
        this.mouse=mouse;
    }
    public void usesMouse(){
        mouse.click();
    }
}
