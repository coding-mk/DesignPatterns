package org.example.TicTacToe.controllers;

import org.example.TicTacToe.exceptions.InvalidPlayerCountException;
import org.example.TicTacToe.exceptions.InvalideBotCountException;
import org.example.TicTacToe.models.Game;
import org.example.TicTacToe.models.GameState;
import org.example.TicTacToe.models.Player;
import org.example.TicTacToe.strategies.winningStrategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game StartGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws InvalideBotCountException, InvalidPlayerCountException {
        return Game.getBuilder()
                    .setDimension(dimension)
                    .setPlayers1(players)
                    .setWinningStrategies(winningStrategies)
                    .build();
    }

    public void MakeMove(Game game){

    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
