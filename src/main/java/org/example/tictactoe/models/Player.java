package org.example.tictactoe.models;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Player { //HUMAN Player
    private Long id;
    private String name;
    private PlayerType playerType;
    private Symbol symbol;
    private Scanner scanner;

    public Player(Long id, String name, PlayerType playerType, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
        scanner = new Scanner(System.in);
    }

    public Move makeMove(Board board) {
        System.out.println("Please enter the row where you want to make a move.");
        int row = scanner.nextInt();

        System.out.println("Please enter the col where you want to make a move.");
        int col = scanner.nextInt();

        return new Move(this, new Cell(row, col));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
