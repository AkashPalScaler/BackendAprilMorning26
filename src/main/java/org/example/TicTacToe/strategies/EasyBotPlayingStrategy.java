package org.example.TicTacToe.strategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Cell;
import org.example.TicTacToe.models.CellState;
import org.example.TicTacToe.models.Player;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Cell makeMove(Board board, Player player) {
        // Next empty cell
        for(List<Cell> row : board.getGrid()){
            for (Cell cell : row) {
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Cell(cell.getRow(), cell.getCol());
                }
            }
        }
        return null;
    }
}
