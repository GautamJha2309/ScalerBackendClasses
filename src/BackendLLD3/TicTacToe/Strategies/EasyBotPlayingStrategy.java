package BackendLLD3.TicTacToe.Strategies;

import BackendLLD3.TicTacToe.models.Board;
import BackendLLD3.TicTacToe.models.Cell;
import BackendLLD3.TicTacToe.models.CellState;
import BackendLLD3.TicTacToe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
//                    Bot should make the move in this cell
                    return new Move(new Cell(cell.getRow(), cell.getCol()), null);
                }
            }
        }
        return null;
    }
}


// fill the first empty cell