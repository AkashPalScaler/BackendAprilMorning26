package org.example.TicTacToe.factories;

import org.example.TicTacToe.models.WinningStrategyType;
import org.example.TicTacToe.strategies.ColumnWinningStrategy;
import org.example.TicTacToe.strategies.RowWinningStrategy;
import org.example.TicTacToe.strategies.WinningStrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyType type) {
        // Need to add here the conditions to return correct winning
        // strategy object once winning strategy concrete classes are ready
        if(type == WinningStrategyType.COLUMN) {
            return new ColumnWinningStrategy();
        }else if(type == WinningStrategyType.ROW) {
            return new RowWinningStrategy();
        }else {
            throw new  IllegalArgumentException("Unknown WinningStrategyType");
        }
    }
}
