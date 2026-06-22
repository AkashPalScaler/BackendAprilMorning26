package org.example.TicTacToe.factories;

import org.example.TicTacToe.models.BotDifficultyLevel;
import org.example.TicTacToe.strategies.BotPlayingStrategy;
import org.example.TicTacToe.strategies.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory{
    public static BotPlayingStrategy getInstance(BotDifficultyLevel difficultyLevel) {
        if(difficultyLevel == BotDifficultyLevel.EASy) {
            return new EasyBotPlayingStrategy();
        }else{
            throw new  IllegalArgumentException("Invalid difficulty level: " + difficultyLevel);
        }
    }
}
