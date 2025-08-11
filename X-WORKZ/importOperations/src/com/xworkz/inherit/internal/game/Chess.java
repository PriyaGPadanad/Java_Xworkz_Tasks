package com.xworkz.inherit.internal.game;

public class Chess extends Game{
    public Chess(){
        super();
        System.out.println("Running non-arg constructor chess");
    }
    @Override
    public void start(){
        System.out.println("Setting up chessboard");
    }
    @Override
    public void play(){
        System.out.println("playing chess with strategy");
    }
    @Override
    public void pause(){
        System.out.println("Chess match paused");
    }
    @Override
    public void save(){
        System.out.println("Saving chess match state");
    }
    @Override
    public void quit(){
        System.out.println("Exiting chess match");
    }
    public void promotePawn(){
        System.out.println("NEw method promotePawn in child");
    }

}
