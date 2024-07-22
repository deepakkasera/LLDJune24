package org.example.tictactoe.strategies.botplayingstrategy;

import org.example.tictactoe.models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy  {
    @Override
    public Move makeMove(Board board) {
        for (List<Cell> cells : board.getBoard()) {
            for (Cell cell : cells) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(
                            null,
                            cell
                    );
                }
            }
        }
        return null;
    }
}
