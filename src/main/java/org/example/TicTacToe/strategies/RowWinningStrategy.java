package org.example.TicTacToe.strategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Cell;
import org.example.TicTacToe.models.Move;
import org.example.TicTacToe.models.Player;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Character, Integer>> rowCountMap = new HashMap<>();

    public RowWinningStrategy() {
        rowCountMap =  new HashMap<>();
    }

    @Override
    public boolean check(Board board, Move lastMove) {
        // Update the count of rowCount Map
        Cell cell = lastMove.getCell();
        Player player = lastMove.getPlayer();
        Integer row = cell.getRow();

        rowCountMap.putIfAbsent(row, new HashMap<>());
        HashMap<Character, Integer> countMap = rowCountMap.get(row);

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
        Integer row = cell.getRow();
        HashMap<Character, Integer> countMap = rowCountMap.get(row);
        countMap.put(lastMove.getPlayer().getSymbol().getSym(), lastMove.getPlayer().getSymbol().getSym() - 1);
    }
}
