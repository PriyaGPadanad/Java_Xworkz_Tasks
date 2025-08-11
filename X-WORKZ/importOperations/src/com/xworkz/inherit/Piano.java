package com.xworkz.inherit;

public class Piano extends MusicalInstrument{
    public Piano(){
        super();
        System.out.println("Piano is subclass");
    }
    public void pressKeys(){
        System.out.println("piano keys pressed");
    }
    public void sustainPedal(){
        System.out.println("Piano sustain pedal useds");
    }
}
