package org.example.TicTacToe.strategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Cell;
import org.example.TicTacToe.models.Player;

public interface BotPlayingStrategy {
    Cell makeMove(Board board, Player player);
}
