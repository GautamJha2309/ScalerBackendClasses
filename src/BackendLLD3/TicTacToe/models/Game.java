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
        private Board board;
        private List<Player> players;
        private Integer nextPlayerIndex;
        private GameState gameState;
        private List<Move> moves;
        private List<WinningStrategy> winningStrategies;
        private Player winner;

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

        public Game build() {
            return new Game(this);
        }
    }

//    public void makeMove(){
////        i will make the move
//
//        for(WinningStrategy winningStrategy : winningStrategies){
//            winningStrategy.checkWinner();
//        }
//    }
}

// Requirement

//  choice of users : which are winning rules they want to have
// row winning rules ?
// col winning rules ?

// checkWinner() {
// }