package BackendLLD3.TicTacToe.Strategies;

import BackendLLD3.TicTacToe.models.Board;
import BackendLLD3.TicTacToe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
