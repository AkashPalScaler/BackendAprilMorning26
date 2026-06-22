package org.example.TicTacToe;

import org.example.TicTacToe.controllers.GameController;
import org.example.TicTacToe.models.*;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameController controller = new GameController();

        Player player1 = new HumanPlayer("Akash", new Symbol('X'), PlayerType.HUMAN);
        Player player2 = new BotPlayer("Botty", new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASy);


        Game game = controller.startGame(3,
                List.of(player1, player2),
                List.of(WinningStrategyType.ROW, WinningStrategyType.COLUMN)
        );
        controller.displayGame(game);
        while(controller.checkGameStatus(game) == GameState.IN_PROGRESS){
            controller.makeMove(game);
            controller.displayGame(game);
            System.out.println("Do you want to undo again? (Y/N)");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Y")){
                controller.undo(game);
            }
        }
    }
}
