package BackendLLD3.TicTacToe.Strategies;

import BackendLLD3.TicTacToe.models.BotDiffcultyLevel;

public class BotPlayingStrategyFactory {
    public static  BotPlayingStrategy getBotPlayingStrategy (BotDiffcultyLevel botDiffcultyLevel){
        if (botDiffcultyLevel == BotDiffcultyLevel.EASY) {
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
