package com.xworkz.inheritance.hierarchical.ex10;

public class ArtistRunner {
    public static void main(String[] args){
        Painter painter=new Painter();
        painter.perform();
        painter.paint();

        Singer singer=new Singer();
        singer.sing();
        singer.perform();
    }
}
