package org.example.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        //Create an empty board of given size.
        board = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            board.add(new ArrayList<>());

            for (int j = 0; j < size; j++) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void printBoard() {
        for (List<Cell> cells : board) {
            for (Cell cell : cells) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.print("|  |");
                } else {
                    System.out.print("|" + cell.getPlayer().getSymbol().getaChar() + "|");
                }
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
