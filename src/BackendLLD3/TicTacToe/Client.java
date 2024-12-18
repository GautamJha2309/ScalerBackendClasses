package BackendLLD3.TicTacToe;

import BackendLLD3.TicTacToe.Controller.GameController;
import BackendLLD3.TicTacToe.Strategies.ColWinningStratergy;
import BackendLLD3.TicTacToe.Strategies.DiagonalWinningStrategy;
import BackendLLD3.TicTacToe.Strategies.RowWinningStrategy;
import BackendLLD3.TicTacToe.Strategies.WinningStrategy;
import BackendLLD3.TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GameController gameController = new GameController();
//        to start the game , what are the things that are required
//        size of the board
//        List of players
//        winning strategies
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1 , "Monit" , new Symbol('X')));
        players.add(new Bot(2 , "Betty", new Symbol('O'), BotDiffcultyLevel.EASY));

        int size = 3;

//        Hey User do you want row winning rules ?

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStratergy());
        winningStrategies.add(new DiagonalWinningStrategy());

        Game game = gameController.startGame(
                size,
                players,
                winningStrategies
        );
        gameController.display(game);
        while(gameController.getGameState(game).equals(GameState.INPROGRESS)){
            gameController.makeMove(game);
            gameController.display(game);
            System.out.println("Do you want to Undo the last move? [Y/N]: ");
            String undoAnswer = scanner.nextLine();
            if (undoAnswer.equals("Y") || undoAnswer.equals("Yes") || undoAnswer.equals("y") || undoAnswer.equals("yes")){
                gameController.undo(game);
                System.out.println("Last Move undo Successfully...");
                gameController.display(game);
            }
//            makeMove
//            take the input to make the move
//            update the game state if required
//            update the turn
        }

        if(gameController.getGameState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner: " + gameController.getWinner(game).getName());
        } else if(gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game has ended in a draw");
        }
    }
}

// client wants to play the game
// client wants to create players
// the game flow should be happening for here

// display
// ask current player to makeMove
// checkWinner || draw (After making the move if the game state changes then we should stop the game)
//      If yes game over
//      else game continues
