package org.example.tictactoe.models;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(Long id, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, PlayerType.BOT, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
