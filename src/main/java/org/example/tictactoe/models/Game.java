package org.example.tictactoe.models;

import org.example.tictactoe.exceptions.DuplicateSymbolFoundException;
import org.example.tictactoe.exceptions.InvalidBotCountException;
import org.example.tictactoe.exceptions.InvalidPlayerCountException;
import org.example.tictactoe.strategies.winningstrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private Player winner;
    private List<Move> moves;
    private int nextPlayerMoveIndex;
    private List<WinningStrategy> winningStrategies;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.gameState = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.nextPlayerMoveIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validatePlayerSymbolCount() throws DuplicateSymbolFoundException {
            Map<Character, Integer> symbolCount = new HashMap<>();

            for (Player player : players) {
                if (!symbolCount.containsKey(player.getSymbol().getaChar())) {
                    symbolCount.put(player.getSymbol().getaChar(), 0);
                }

                symbolCount.put(player.getSymbol().getaChar(),
                        symbolCount.get(player.getSymbol().getaChar()) + 1);

                if (symbolCount.get(player.getSymbol().getaChar()) > 1) {
                    throw new DuplicateSymbolFoundException("2 players shouldn't have same symbol");
                }
            }
        }

        private void validatePlayersCount() throws InvalidPlayerCountException {
            if (players.size() != dimension - 1) {
                throw new InvalidPlayerCountException("Number of players should be " + (dimension - 1));
            }
        }

        private void validateBotCount() throws InvalidBotCountException {
            int botCount = 0;
            for (Player player : players) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }

                if (botCount > 1) {
                    throw new InvalidBotCountException("Only one bot is allowed per game");
                }
            }
        }

        private void validate() throws DuplicateSymbolFoundException, InvalidBotCountException, InvalidPlayerCountException {
            //validate no 2 players should have the same symbol.
            validatePlayerSymbolCount();
            //validate number of players
            validatePlayersCount();
            //Validate Bot Count
            validateBotCount();
        }

        public Game build() throws InvalidBotCountException, InvalidPlayerCountException, DuplicateSymbolFoundException {
            //validations.
            validate();

            return new Game(
                    dimension,
                    players,
                    winningStrategies
            );
        }
    }

    private boolean validateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if (row >= 0 && row < board.getSize() && col >= 0 && col < board.getSize()
                && board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)) {
            return true;
        }

        return false;
    }

    public void makeMove() {
        Player currentPlayer = players.get(nextPlayerMoveIndex);

        System.out.println("This is " + currentPlayer.getName() + "'s turn");

        Move move = currentPlayer.makeMove(board);

        //Game should validate the move, whether the move is permissible or not.
//        if (validateMove(move)) {
//            return;
//        }

        //Move is valid, implement the move in the board.
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToMark = board.getBoard().get(row).get(col);
        cellToMark.setCellState(CellState.FILLED);
        cellToMark.setPlayer(currentPlayer);

        Move finalMoveObject = new Move(currentPlayer, cellToMark); // This finalMoveObject actually belongs to the Board.
        moves.add(finalMoveObject);

        nextPlayerMoveIndex += 1;
        nextPlayerMoveIndex %= players.size();

        //After every move, game will check if the current player has WON the game or not.
        if (checkWinner(board, finalMoveObject)) {
            gameState = GameState.ENDED;
            winner = currentPlayer;
        } else if (moves.size() == board.getSize() * board.getSize()) {
            //Game has DRAWN
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move move) {
        for (WinningStrategy winningStrategy : winningStrategies) {
            if (winningStrategy.checkWinner(board, move)) {
                return true;
            }
        }

        return false;
    }

    public void printBoard() {
        board.printBoard();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
