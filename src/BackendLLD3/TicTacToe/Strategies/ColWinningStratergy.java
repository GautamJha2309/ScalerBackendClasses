package BackendLLD3.TicTacToe.Strategies;

import BackendLLD3.TicTacToe.models.Board;
import BackendLLD3.TicTacToe.models.Move;

import java.util.HashMap;

public class ColWinningStratergy implements WinningStrategy {

    private HashMap<Integer , HashMap<Character , Integer>> colCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int col = move.getCell().getCol();
        Character sym = move.getPlayer().getSymbol().getSymChar();

        if(!colCounts.containsKey(col)){
            colCounts.put(col, new HashMap<>());
        }

        HashMap<Character , Integer> counts = colCounts.get(col);
        if(!counts.containsKey(sym)){
            counts.put(sym, 0);
        }

        counts.put(sym, counts.get(sym) + 1);

        if(counts.get(sym) == board.getSize()){
            return true;
        }

        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int col = move.getCell().getCol();
        Character sym = move.getPlayer().getSymbol().getSymChar();
        colCounts.get(col).put(sym, colCounts.get(col).get(sym) + 1);
    }
}
