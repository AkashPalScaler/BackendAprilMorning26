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

    public void display() {
        if(this.cellState == CellState.EMPTY) {
            System.out.print("| |");
        }else {
            System.out.print("|" + this.symbol.getSym() + "|");
        }
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }
}
