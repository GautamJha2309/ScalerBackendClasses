package BackendLLD3.TicTacToe.models;

import BackendLLD3.TicTacToe.Strategies.BotPlayingStrategyFactory;

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

    @Override
    public Move makeMove(Board board) {
        return BotPlayingStrategyFactory
                .getBotPlayingStrategy(botDiffcultyLevel)
                .makeMove(board);
    }
}
