package org.example.TicTacToe.models;

import org.example.TicTacToe.factories.BotPlayingStrategyFactory;
import org.example.TicTacToe.strategies.BotPlayingStrategy;

public class BotPlayer extends Player {
    BotDifficultyLevel botDifficultyLevel;

    public BotPlayer(String name, Symbol symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Cell makeMove(Board board) {
        BotPlayingStrategy strategy =  BotPlayingStrategyFactory
                .getInstance(botDifficultyLevel);

        return strategy.makeMove(board, this);
    }
}
