package org.example.TicTacToe;

import org.example.TicTacToe.controllers.GameController;
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
    public static void main(String[] args) throws InvalideBotCountException, InvalidPlayerCountException {
        System.out.println("Hello World!");
        int dimension =3;

        List<Player> players = new ArrayList<>();
        players.add(new Player("Manish", new Symbol('M'), PlayerType.HUMAN));
        players.add(new Player("Krithi", new Symbol('K'), PlayerType.HUMAN));

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DigonalWinningStrategy()
        );

        GameController gameController = new GameController();
        Game game = gameController.StartGame(dimension, players, winningStrategies);

        while (game.getGameState().equals(GameState.IN_PROGRESS)){
            gameController.printBoard(game);
        }

    }
}
