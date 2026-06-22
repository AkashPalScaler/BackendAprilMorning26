package org.example.TicTacToe.strategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Cell;
import org.example.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean check(Board board, Move lastMove);

    void handleUndo(Move lastMove);
}
