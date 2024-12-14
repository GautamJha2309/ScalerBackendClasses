package BackendLLD3.TicTacToe.Controller;

import BackendLLD3.TicTacToe.Strategies.WinningStrategy;
import BackendLLD3.TicTacToe.models.Game;
import BackendLLD3.TicTacToe.models.GameState;
import BackendLLD3.TicTacToe.models.Player;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public Game startGame(
            int size,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        try {
            //Builder Type 1
            return Game.getBuilder()
                    .setSize(size)
                    .setPlayers(players)
                    .setWinningStrategies(winningStrategies)
                    .build();

            //Builder Type 2 (Will all Parameter setter)
    //        return Game.getBuilder()
    //                    .setBoard(size)
    //                    .setPlayers(players)
    //                    .setWinningStrategies(winningStrategies)
    //                    .setNextPlayerIndex(0)
    //                    .setGameState(GameState.INPROGRESS)
    //                    .setWinner(null)
    //                    .setMoves(new ArrayList<>())
    //                    .buildWithAll();

    //        return new Game(
    //                size,
    //                players,
    //                winningStrategies
    //        );

//        Game.getBuilder().setSize().setPlayers().build();
//        validations will be there
//          1. No of players = size - 1
//          2. All players should have distinct symbols
//          3. We only have at max One Bot
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Sorry. Please try to start the Game again with valid inputs");
//            throw new RuntimeException(e);
        }
        return null;
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void display(Game game){
        game.displayBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){
        game.undo();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
