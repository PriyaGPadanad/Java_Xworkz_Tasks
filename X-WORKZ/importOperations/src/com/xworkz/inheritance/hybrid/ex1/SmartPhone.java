package com.xworkz.inheritance.hybrid.ex1;

import com.xworkz.inheritance.hybrid.ex1.Gadget;
import com.xworkz.inheritance.hybrid.ex1.MusicPlayer;

public class SmartPhone extends Gadget implements MusicPlayer {
    @Override
    public void playMusic(){
        System.out.println("SmartPhone plays music");
    }
}
