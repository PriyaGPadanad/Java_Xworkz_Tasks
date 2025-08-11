package com.xworkz.interfaceusage.ex21;

public class Bathroom {
    private Brush brush;
    public Bathroom(Brush brush){
        this.brush=brush;
    }
    public void performCleaning(){
        brush.clean();
    }
}
