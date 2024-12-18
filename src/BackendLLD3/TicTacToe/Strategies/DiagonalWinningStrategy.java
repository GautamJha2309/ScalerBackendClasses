package BackendLLD3.TicTacToe.Strategies;

import BackendLLD3.TicTacToe.models.Board;
import BackendLLD3.TicTacToe.models.Move;
import BackendLLD3.TicTacToe.models.Symbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DiagonalWinningStrategy implements WinningStrategy{
    private HashMap<Character , ArrayList<ArrayList<Integer>>>diagonalCounts = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
//        for i in size:
//        case 1: (i,i) and case 2: (i, size - i - 1)
//        case 1 for 3 X 3 TicTacToe: (0,0), (1,1), (2,2)
//        case 2 for 3 X 3 TicTacToe: (0,2), (1,1), (2,0)
        int size = board.getSize();
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Character sym = move.getPlayer().getSymbol().getSymChar();
        List<List<Integer>> pattern1 = new ArrayList<>();
        List<List<Integer>> pattern2 = new ArrayList<>();

        if (!diagonalCounts.containsKey(sym)) {
            diagonalCounts.put(sym, new ArrayList<>()); // Initialize the list
        }

        // Add the new pair (row, col) to the list
        diagonalCounts.get(sym).add(new ArrayList<>(Arrays.asList(row, col)));

        if (diagonalCounts.get(sym).size() == size) {
            for (int i = 0; i < size; i++) {
                pattern1.add(List.of(i, i));
                pattern2.add(List.of(i, size - 1 - i));
            }
        }

        return diagonalCounts.get(sym).equals(pattern1) || diagonalCounts.get(sym).equals(pattern2);
//        System.out.println("Won Diagonally");
    }

    @Override
    public void handleUndo(Board board, Move move) {
        Character sym = move.getPlayer().getSymbol().getSymChar();
        int lastMoveIndex = diagonalCounts.get(sym).size() - 1;
        diagonalCounts.get(sym).remove(lastMoveIndex);
    }
}
