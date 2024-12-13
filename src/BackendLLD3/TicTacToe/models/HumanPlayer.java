package BackendLLD3.TicTacToe.models;

public class HumanPlayer extends Player{
    private Integer level;
    private Integer coin;

    public HumanPlayer(Integer id, String name, Symbol symbol) {
        super(id, name, PlayerType.HUMAN_PLAYER, symbol);
        this.level = 1;
        this.coin = 0;
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
}
