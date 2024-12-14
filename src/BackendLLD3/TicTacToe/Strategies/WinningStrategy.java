package BackendLLD3.TicTacToe.Strategies;

import BackendLLD3.TicTacToe.models.Board;
import BackendLLD3.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
    void handleUndo(Board board, Move move);
}
