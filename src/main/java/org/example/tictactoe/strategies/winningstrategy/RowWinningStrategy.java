package org.example.tictactoe.strategies.winningstrategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;
import org.example.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {
    Map<Integer, Map<Symbol, Integer>> rowCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if (!rowCounts.containsKey(row)) {
            rowCounts.put(row, new HashMap<>());
        }

        Map<Symbol, Integer> currentRowMap = rowCounts.get(row);

        if (!currentRowMap.containsKey(symbol)) {
            currentRowMap.put(symbol, 0);
        }

        currentRowMap.put(symbol, currentRowMap.get(symbol) + 1);

        if (currentRowMap.get(symbol).equals(board.getSize())) {
            return true;
        }

        return false;
    }
}
