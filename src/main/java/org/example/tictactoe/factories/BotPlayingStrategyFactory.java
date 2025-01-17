package org.example.tictactoe.factories;

import org.example.tictactoe.models.BotDifficultyLevel;
import org.example.tictactoe.strategies.botplayingstrategy.BotPlayingStrategy;
import org.example.tictactoe.strategies.botplayingstrategy.EasyBotPlayingStrategy;
import org.example.tictactoe.strategies.botplayingstrategy.HardBotPlayingStrategy;
import org.example.tictactoe.strategies.botplayingstrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        if (botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BotDifficultyLevel.HARD)) {
            return new HardBotPlayingStrategy();
        }
        return null;
    }
}
