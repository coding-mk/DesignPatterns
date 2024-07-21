package org.example.TicTacToe.strategies.botPlayingStrategies;

import org.example.TicTacToe.models.Board;
import org.example.TicTacToe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
