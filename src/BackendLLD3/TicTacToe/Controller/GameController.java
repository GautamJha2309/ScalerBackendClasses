package BackendLLD3.TicTacToe.Controller;

import BackendLLD3.TicTacToe.Strategies.WinningStrategy;
import BackendLLD3.TicTacToe.models.Game;
import BackendLLD3.TicTacToe.models.GameState;
import BackendLLD3.TicTacToe.models.Player;

import java.util.List;

public class GameController {

    public Game startGame(
            int size,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        return new Game(
                size,
                players,
                winningStrategies
        );

//        Game.getBuilder().setSize().setPlayers().build();
//        validations will be there
//          1. No of players = size - 1
//          2. All players should have distinct symbols
//          3. We only have at max One Bot
    }

    public GameState getGameState(Game game){
        return GameState.INPROGRESS;
    }

    public void display(Game game){
        game.displayBoard();
    }

    public void makeMove(Game game){

    }

    public void undo(Game game){

    }

    public Player getWinner(Game game){
        return null;
    }
}
