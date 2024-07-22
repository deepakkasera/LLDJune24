package org.example.tictactoe.controllers;

import org.example.tictactoe.exceptions.DuplicateSymbolFoundException;
import org.example.tictactoe.exceptions.InvalidBotCountException;
import org.example.tictactoe.exceptions.InvalidPlayerCountException;
import org.example.tictactoe.models.Game;
import org.example.tictactoe.models.GameState;
import org.example.tictactoe.models.Player;
import org.example.tictactoe.strategies.winningstrategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidPlayerCountException, DuplicateSymbolFoundException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
