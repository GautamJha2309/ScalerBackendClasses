package BackendLLD3.TicTacToe.models;

import java.util.Scanner;

public class HumanPlayer extends Player{
    private Integer level;
    private Integer coin;
    private Scanner scanner;

    public HumanPlayer(Integer id, String name, Symbol symbol) {
        super(id, name, PlayerType.HUMAN_PLAYER, symbol);
        this.level = 1;
        this.coin = 0;
        scanner = new Scanner(System.in);
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Please enter the row in which you want to play");
        int row = scanner.nextInt();
        System.out.println("Please enter the column in which you want to play");
        int column = scanner.nextInt();

        return new Move(new Cell(row, column), this);
    }
}
