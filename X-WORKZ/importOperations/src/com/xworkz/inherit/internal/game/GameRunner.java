package com.xworkz.inherit.internal.game;

public class GameRunner {
    public static void main(String[] args){
        Game game1=new Game();
        game1.start();
        game1.play();
        game1.pause();
        game1.save();
        game1.quit();

        System.out.println("-----");
        Game game=new Chess();
        game.start();
        game.play();
        game.pause();
        game.save();
        game.quit();

        System.out.println("-----casting example----");
        Chess chess=new Chess();
        chess.start();
        chess.play();
        chess.pause();
        chess.save();
        chess.quit();

        Player player=new Player();
        player.use(game1);
        player.use(game);
        player.use(chess);
    }
}
