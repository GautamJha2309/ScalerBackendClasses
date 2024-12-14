package BackendLLD3.TicTacToe.models;

import BackendLLD3.TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Integer nextPlayerIndex;
    private GameState gameState;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private Player winner;

//    HW : Clone the project and implement Builder design patter for Game class

    public Game(Integer size, List<Player> players, List<WinningStrategy> winningStrategies) {
        board = new Board(size);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.nextPlayerIndex = 0;
        this.gameState = GameState.INPROGRESS;
        this.winner = null;
        this.moves = new ArrayList<>();
    }

    public Game(GameBuilder builder) {
        this.board = builder.getBoard();
        this.players = builder.getPlayers();
        this.nextPlayerIndex = builder.getNextPlayerIndex();
        this.gameState = builder.getGameState();
        this.moves = builder.getMoves();
        this.winningStrategies = builder.getWinningStrategies();
        this.winner = builder.getWinner();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void displayBoard(){
        board.display();
    }

    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public static class GameBuilder {
        private int size;
        private Board board;
        private List<Player> players;
        private Integer nextPlayerIndex;
        private GameState gameState;
        private List<Move> moves;
        private List<WinningStrategy> winningStrategies;
        private Player winner;

        public int getSize() {
            return size;
        }

        public GameBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public Board getBoard() {
            return board;
        }

        public GameBuilder setBoard(int size) {
            this.board = new Board(size);
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Integer getNextPlayerIndex() {
            return nextPlayerIndex;
        }

        public GameBuilder setNextPlayerIndex(Integer nextPlayerIndex) {
            this.nextPlayerIndex = nextPlayerIndex;
            return this;
        }

        public GameState getGameState() {
            return gameState;
        }

        public GameBuilder setGameState(GameState gameState) {
            this.gameState = gameState;
            return this;
        }

        public List<Move> getMoves() {
            return moves;
        }

        public GameBuilder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Player getWinner() {
            return winner;
        }

        public GameBuilder setWinner(Player winner) {
            this.winner = winner;
            return this;
        }

        public void validation() {
//            Bot count should be only 1
//            Number of player = size - 1
//            All Players should have different symbol
//            please complete the section

//            please throw exception if anything is invalid
//            and catch the exception within the controller

        }

        //Builder Type 1
        public Game build() {
            return new Game(size, players, winningStrategies);
        }

        //Builder Type 2 (Will all Parameter setter)
        public Game buildWithAll() {
            return new Game(this);
        }

    }

    private boolean validateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()) {
            return false;
        }
        return board.getGrid().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }

    private void updateGameState(Move move, Player currentPlayer) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getGrid().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getSymbol());

        move.setCell(cellToChange);
        move.setPlayer(currentPlayer);
        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();
    }

    private boolean checkWinner(Move move) {
        for(WinningStrategy winningStrategy : winningStrategies) {
            if (winningStrategy.checkWinner(board, move)) {
                return true;
            }
        }
        return false;
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println("It's " + currentPlayer.getName() + "'s move");

        Move move = currentPlayer.makeMove(board);
        if (!validateMove(move)) {
            System.out.println("This is invalid move, please try again");
            return;
        }

        updateGameState(move, currentPlayer);

        if (checkWinner(move)) {
            winner = currentPlayer;
            gameState = GameState.SUCCESS;
        }
        else if (moves.size() == board.getSize() * board.getSize()) {
            gameState = GameState.DRAW;
        }
    }

//    It's a Global undo, anyone can do UNDO
    public void undo() {
        if (moves.size() == 0) {
            System.out.println("There is nothing to Undo..!");
            return;
        }

        Move lastMove = moves.get(moves.size() - 1);
        moves.remove(moves.size() - 1);

        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setSymbol(null);

//        (A - B) % N = (A - B + N) % N
        nextPlayerIndex--;
        nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();

        for (WinningStrategy winningStrategy : winningStrategies) {
            winningStrategy.handleUndo(board, lastMove);
        }

        setGameState(GameState.INPROGRESS);
        setWinner(null);
    }
}

// Requirement

//  choice of users : which are winning rules they want to have
// row winning rules ?
// col winning rules ?

// checkWinner() {
// }