package org.example.TicTacToe.factory;

import org.example.TicTacToe.models.BotDifficultyLevel;
import org.example.TicTacToe.strategies.botPlayingStrategies.BotPlayingStrategy;
import org.example.TicTacToe.strategies.botPlayingStrategies.EasyBotPlayingStrategy;
import org.example.TicTacToe.strategies.botPlayingStrategies.HardBotPlayingStrategy;
import org.example.TicTacToe.strategies.botPlayingStrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel){
        if(difficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }else if(difficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumBotPlayingStrategy();
        }else if(difficultyLevel.equals(BotDifficultyLevel.HARD)){
            return new HardBotPlayingStrategy();
        }
        return null;
    }
}
