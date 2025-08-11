package com.xworkz.Projector.internal;

public class Projector {
    int lensLength;
    int lampHours;

    Lamp lamp;
    Port port;
    Wire wire;
    Board board;
    Button button;
    Panel panel;
    Remote remote;
    Screw screw;


    public Projector() {
        lensLength = 10;
        lampHours = 500;

        lamp = new Lamp();
        port = new Port();
        wire = new Wire();
        board = new Board();
        button = new Button();
        panel = new Panel();
        remote = new Remote();
        screw = new Screw();
    }

    public void turnOn() {
        System.out.println("Projector is turning on.");
    }
}
