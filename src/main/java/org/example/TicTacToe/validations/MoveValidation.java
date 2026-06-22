package org.example.TicTacToe.validations;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Cell;
import org.example.TicTacToe.models.CellState;

public class MoveValidation {
    public static void validate(Board board, Cell cell) {
        if(cell.getRow() < 0 || cell.getRow() >= board.getSize() || cell.getCol() < 0 || cell.getCol() >= board.getSize()){
            throw new IllegalArgumentException("Cell is out of board");
        }
        if(board.getGrid().get(cell.getRow()).get(cell.getCol()).getCellState() == CellState.FILLED){
            throw new  IllegalArgumentException("Cell is already filled");
        }
    }
}
