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
