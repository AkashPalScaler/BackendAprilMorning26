package org.example.TicTacToe.models;

import org.example.TicTacToe.factories.WinningStrategyFactory;
import org.example.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    List<WinningStrategy> winningStrategies;
    GameState gameState;
    Player winner;
    Integer nextPlayerIndex; 
    List<Move> moves;

    private Game(Integer size, List<Player> players, List<WinningStrategyType> winningStrategyTypes) {
        // Validation can be done here
        this.board = new Board(size);
        this.players = players;
        this.winningStrategies = new ArrayList<>();
        for(WinningStrategyType winningStrategyType : winningStrategyTypes) {
            this.winningStrategies.add(WinningStrategyFactory.getWinningStrategy(winningStrategyType));
        }
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.nextPlayerIndex = 0;
        moves = new ArrayList<>();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void display() {
        this.board.display();
        System.out.println("Game State: " + this.gameState);
        if (gameState.equals(GameState.WON)) {
            System.out.println(winner.getName() + " has won the game!");
        }
        System.out.println();
    }

    public void makeMove() {
        // Get the current player
        Player curr_player = players.get(nextPlayerIndex);
        // Update the player index
        nextPlayerIndex =  (nextPlayerIndex + 1) % players.size(); // 0, 1, 2, 0, 1, 2, 0, ..
        // Ask current player to make move
        // - Human player - we take input cell
        // - Bot player - our code decides the cell
        Cell move_cell = curr_player.makeMove(this.board);
        move_cell.setSymbol(curr_player.getSymbol());
        // Update the cell on the board
        List<List<Cell>> grid = this.board.getGrid();
        Cell board_cell = grid.get(move_cell.getRow()).get(move_cell.getCol());
        board_cell.setSymbol(curr_player.getSymbol());
        board_cell.setCellState(CellState.FILLED);

        // Update the moves list
        this.moves.add(new Move(board_cell, curr_player));
        // Check game status
        this.updateGameStatus(curr_player);
    }

    public void undoMove() {
        // Fetch and remove the last move from move list
        Move lastMove = moves.get(moves.size() - 1);
        // rollback to the prev user, we have to decrement nextPlayerIndex
        nextPlayerIndex = (nextPlayerIndex - 1) % players.size();
        // Update the board (clear the move cell)
        List<List<Cell>> grid = this.board.getGrid();
        Cell move_cell = lastMove.getCell();
        Cell board_cell = grid.get(move_cell.getRow()).get(move_cell.getCol());
        board_cell.setSymbol(null);
        board_cell.setCellState(CellState.EMPTY);
        // Rollback the game status update
        this.winner = null;
        this.gameState = GameState.IN_PROGRESS;
        for(WinningStrategy winningStrategy : winningStrategies) {
            winningStrategy.handleUndo(lastMove);
        }

    }

    private void updateGameStatus(Player curr_player) {
        // Logic of checking draw/winner
        if(checkWinner()){
            setWinner(curr_player);
            setGameState(GameState.WON);
        }else if (this.moves.size() == board.getSize()* board.getSize()){
            setGameState(GameState.DRAW);
        }
    }

    private boolean checkWinner() {
        for(WinningStrategy winningStrategy : winningStrategies) {
            if(winningStrategy.check(this.board, this.moves.getLast())){
                return true;
            }
        }
        return false;
    }

    public static class Builder{
        Integer size;
        List<Player> players;
        List<WinningStrategyType> winningStrategyTypes;

        public int getSize() {
            return size;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinningStrategyType> getWinningStrategyTypes() {
            return winningStrategyTypes;
        }

        public Builder setWinningStrategyTypes(List<WinningStrategyType> winningStrategyTypes) {
            this.winningStrategyTypes = winningStrategyTypes;
            return this;
        }

        //build --> we will be creating object of game
        public Game build(){
            // Validation can be done here - will do this later
            return new Game(size, players, winningStrategyTypes);
        }
    }
}
// Break till 8:10