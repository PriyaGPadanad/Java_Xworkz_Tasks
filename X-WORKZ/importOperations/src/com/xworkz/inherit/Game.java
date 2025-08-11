package com.xworkz.inherit;

public class Game {
    public Game(){
        System.out.println("game is superclass");
    }
    public void play(){
        System.out.println("playing game");
    }
    public void startGame() {
        System.out.println("Game started!");
    }
    public void endGame() {
        System.out.println("Game over!");
    }
    public void restartGame() {
        System.out.println("Game restarted!");
    }
    public void pauseGame() {
        System.out.println("Game paused.");
    }
    public void resumeGame() {
        System.out.println("Game resumed.");
    }


}
