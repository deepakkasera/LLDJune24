package org.example.tictactoe.strategies.winningstrategy;

import org.example.tictactoe.models.Board;
import org.example.tictactoe.models.Move;
import org.example.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy {
    Map<Integer, Map<Symbol, Integer>> colCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (!colCounts.containsKey(col)) {
            colCounts.put(col, new HashMap<>());
        }

        Map<Symbol, Integer> currentColMap = colCounts.get(col);

        if (!currentColMap.containsKey(symbol)) {
            currentColMap.put(symbol, 0);
        }

        currentColMap.put(symbol, currentColMap.get(symbol) + 1);

        if (currentColMap.get(symbol).equals(board.getSize())) {
            return true;
        }

        return false;
    }
}
