package com.xworkz.interfaceusage.ex9;

public class MusicPlayer {
    private Speaker speaker;
    public MusicPlayer(Speaker speaker){
        this.speaker=speaker;
    }
    public void play(){
        speaker.playSound();
    }
}
