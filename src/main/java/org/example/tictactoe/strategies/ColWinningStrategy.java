package org.example.tictactoe.strategies;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;

public class ColWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
