package org.example;

import org.example.tictactoe.controllers.GameController;
import org.example.tictactoe.models.Game;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Start the game
//        Game.Builder builder = new Game.Builder();
//        builder.setDimension(3).setPlayers(new ArrayList<>()).setWinningStrategies(null);
//        Game game = builder.build();

//        Game game = Game.getBuilder()
//                .setDimension(3)
//                .setPlayers(new ArrayList<>())
//                .setWinningStrategies(new ArrayList<>())
//                .build();

        GameController gameController = new GameController();

        //Game game = gameController.startGame(3, new ArrayList<>(), new ArrayList<>());



    }
}