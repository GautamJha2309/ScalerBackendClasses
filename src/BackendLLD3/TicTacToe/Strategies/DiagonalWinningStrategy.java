package BackendLLD3.TicTacToe.Strategies;

import BackendLLD3.TicTacToe.models.Board;
import BackendLLD3.TicTacToe.models.Move;

public class DiagonalWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        System.out.println("Won Diagonally");
        return true;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
