package org.example.TicTacToe.models;

import org.example.TicTacToe.validations.MoveValidation;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner sc = new Scanner(System.in);
    public HumanPlayer(String name, Symbol symbol, PlayerType playerType) {
        super(name, symbol, playerType);
    }

    @Override
    public Cell makeMove(Board board) {
        System.out.println("Please enter the row where you want to make a move : ");
        int row = sc.nextInt();
        System.out.println("Please enter the column where you want to make a move : ");
        int column = sc.nextInt();
        Cell cell = new Cell(row, column);
        MoveValidation.validate(board, cell);
        return cell;
    }
}
