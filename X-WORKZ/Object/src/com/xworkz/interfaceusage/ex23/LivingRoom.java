package com.xworkz.interfaceusage.ex23;

public class LivingRoom {
private SpeakerSystem speaker;
public LivingRoom(SpeakerSystem speaker)
{
this.speaker=speaker;
}
public void playMovieSound(){
speaker.outputSound();
}
}