package org.example.TicTacToe.strategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Cell;
import org.example.TicTacToe.models.Move;
import org.example.TicTacToe.models.Player;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Character, Integer>> colCountMap = new HashMap<>();

    public ColumnWinningStrategy() {
        colCountMap =  new HashMap<>();
    }

    @Override
    public boolean check(Board board, Move lastMove) {
        // Update the count of rowCount Map
        Cell cell = lastMove.getCell();
        Player player = lastMove.getPlayer();
        Integer col = cell.getCol();

        colCountMap.putIfAbsent(col, new HashMap<>());
        HashMap<Character, Integer> countMap = colCountMap.get(col);

        countMap.putIfAbsent(player.getSymbol().getSym(), 0);
        countMap.put(player.getSymbol().getSym(), countMap.get(player.getSymbol().getSym()) + 1);

        // Check the count of the symbol of the map
        // If count is same as board size , return true
        if(countMap.get(player.getSymbol().getSym()) == board.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Move lastMove) {
        Cell cell  = lastMove.getCell();
        Integer col = cell.getCol();
        HashMap<Character, Integer> countMap = colCountMap.get(col);
        countMap.put(lastMove.getPlayer().getSymbol().getSym(), lastMove.getPlayer().getSymbol().getSym() - 1);
    }
}
