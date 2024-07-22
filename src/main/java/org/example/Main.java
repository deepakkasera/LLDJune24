package org.example;

import org.example.tictactoe.controllers.GameController;
import org.example.tictactoe.exceptions.DuplicateSymbolFoundException;
import org.example.tictactoe.exceptions.InvalidBotCountException;
import org.example.tictactoe.exceptions.InvalidPlayerCountException;
import org.example.tictactoe.models.*;
import org.example.tictactoe.strategies.winningstrategy.ColWinningStrategy;
import org.example.tictactoe.strategies.winningstrategy.DiagonalWinningStrategy;
import org.example.tictactoe.strategies.winningstrategy.RowWinningStrategy;
import org.example.tictactoe.strategies.winningstrategy.WinningStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidBotCountException, InvalidPlayerCountException, DuplicateSymbolFoundException {
        //Start the game
//        Game.Builder builder = new Game.Builder();
//        builder.setDimension(3).setPlayers(new ArrayList<>()).setWinningStrategies(null);
//        Game game = builder.build();

//        Game game = Game.getBuilder()
//                .setDimension(3)
//                .setPlayers(new ArrayList<>())
//                .setWinningStrategies(new ArrayList<>())
//                .build();

        //Game game = gameController.startGame(3, new ArrayList<>(), new ArrayList<>());

        GameController gameController = new GameController();

        List<Player> players = List.of(
                new Player(1L, "Vadala", PlayerType.HUMAN, new Symbol('X')),
                new Bot(2L, "Scaler", new Symbol('O'), BotDifficultyLevel.EASY)
        );

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        Game game = gameController.startGame(3, players, winningStrategies);

        while (gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            //1. print board.
            //2. Ask the player to make the move.

            gameController.printBoard(game);

            gameController.makeMove(game);
        }

        System.out.println("Game has finished.");

        if (gameController.checkState(game).equals(GameState.ENDED)) {
            System.out.println("Game has ENDED, " + gameController.getWinner(game).getName() + " is the winner.");
        } else {
            System.out.println("Game has DRAWN");
        }

    }
}