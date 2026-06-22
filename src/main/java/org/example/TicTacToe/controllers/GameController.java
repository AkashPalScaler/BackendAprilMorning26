package org.example.TicTacToe.controllers;

import org.example.TicTacToe.models.Game;
import org.example.TicTacToe.models.GameState;
import org.example.TicTacToe.models.Player;
import org.example.TicTacToe.models.WinningStrategyType;

import java.util.List;

// Rest API -> Controller functions
public class GameController {
    // start game // actually return a game ID
    public Game startGame(Integer size, List<Player> players, List<WinningStrategyType> winningStrategyTypes){
        return Game.getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategyTypes(winningStrategyTypes)
                .build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public void displayGame(Game game) {
        game.display();
    }

    public GameState checkGameStatus(Game game) {
        return game.getGameState();
    }

    public void undo(Game game) {
        game.undoMove();
    }
    // check game status
    // Make move
    // Display game
}
