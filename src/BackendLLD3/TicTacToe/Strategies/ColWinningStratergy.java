package BackendLLD3.TicTacToe.Strategies;

import BackendLLD3.TicTacToe.models.Board;
import BackendLLD3.TicTacToe.models.Move;

public class ColWinningStratergy implements WinningStrategy {

    @Override
    public boolean checkWinner(Board board, Move move) {
        System.out.println("Col Winner");
        return false;
    }
}
