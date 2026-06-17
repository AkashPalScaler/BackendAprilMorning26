package org.example.TicTacToe.models;

public class Cell {
    Integer row,col;
    Symbol symbol;
    CellState cellState;

    public Cell(Integer row, Integer col) {
        this.row = row;
        this.col = col;
        this.cellState =  CellState.EMPTY;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
