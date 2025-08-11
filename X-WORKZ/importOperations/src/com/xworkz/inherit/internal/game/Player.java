package com.xworkz.inherit.internal.game;

public class Player {
    public void use(Game game){
        game.start();
        game.play();
        game.pause();
        game.save();
        game.quit();

        if(game instanceof Chess){
            System.out.println("game is an instance of Chess");
            Chess chess=(Chess) game;
            chess.promotePawn();
        }
    }
}
