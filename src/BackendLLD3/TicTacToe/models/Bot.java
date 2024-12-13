package BackendLLD3.TicTacToe.models;

public class Bot extends Player{
    private BotDiffcultyLevel botDiffcultyLevel;

    public Bot(Integer id, String name, Symbol symbol, BotDiffcultyLevel botDiffcultyLevel) {
        super(id, name, PlayerType.BOT, symbol);
        this.botDiffcultyLevel = botDiffcultyLevel;
    }

    public BotDiffcultyLevel getBotDiffcultyLevel() {
        return botDiffcultyLevel;
    }

    public void setBotDiffcultyLevel(BotDiffcultyLevel botDiffcultyLevel) {
        this.botDiffcultyLevel = botDiffcultyLevel;
    }
}
