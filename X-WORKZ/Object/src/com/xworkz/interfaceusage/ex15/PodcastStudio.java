package com.xworkz.interfaceusage.ex15;

public class PodcastStudio {
    private Microphone mic;
    public PodcastStudio(Microphone mic){
        this.mic=mic;
    }
    public void startRecording(){
        mic.record();
    }
}
