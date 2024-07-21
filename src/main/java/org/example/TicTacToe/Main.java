package org.example.TicTacToe;

import org.example.TicTacToe.controllers.GameController;
import org.example.TicTacToe.exceptions.InvalidMoveException;
import org.example.TicTacToe.exceptions.InvalidPlayerCountException;
import org.example.TicTacToe.exceptions.InvalideBotCountException;
import org.example.TicTacToe.models.*;
import org.example.TicTacToe.strategies.winningStrategies.ColWinningStrategy;
import org.example.TicTacToe.strategies.winningStrategies.DigonalWinningStrategy;
import org.example.TicTacToe.strategies.winningStrategies.RowWinningStrategy;
import org.example.TicTacToe.strategies.winningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalideBotCountException, InvalidPlayerCountException, InvalidMoveException {
        System.out.println("Hello World!");
        int dimension =3;

        List<Player> players = new ArrayList<>();
        players.add(new Player("Manish", new Symbol('M'), PlayerType.HUMAN));
        //players.add(new Player("Krithi", new Symbol('K'), PlayerType.HUMAN));
        players.add(new Bot("Krithi", new Symbol('K'), BotDifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DigonalWinningStrategy()
        );

        GameController gameController = new GameController();
        Game game = gameController.StartGame(dimension, players, winningStrategies);

        while (game.getGameState().equals(GameState.IN_PROGRESS)){
            gameController.printBoard(game);
            gameController.MakeMove(game);
        }

        if(game.getGameState().equals(GameState.ENDED)){
            gameController.printBoard(game);
            System.out.println(gameController.getWinner(game).getName() + " has won the game");
        }else{
            System.out.println("Game draw");
        }
    }
}
