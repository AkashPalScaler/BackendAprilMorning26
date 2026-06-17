package org.example.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    Integer size;
    List<List<Cell>> grid;

    public Board(Integer size) {
        this.size = size;
        this.grid = new ArrayList<>();

        for(int i=0; i<size; i++) {
            List<Cell> row = new ArrayList<>();
            for(int j=0; j<size; j++) {
                row.add(new Cell(i, j));
            }
            this.grid.add(row);
        }
    }
}
