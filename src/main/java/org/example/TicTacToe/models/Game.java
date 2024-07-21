package org.example.TicTacToe.models;

import org.example.TicTacToe.exceptions.InvalidMoveException;
import org.example.TicTacToe.exceptions.InvalidPlayerCountException;
import org.example.TicTacToe.exceptions.InvalideBotCountException;
import org.example.TicTacToe.strategies.winningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerMoveindex;
    List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerMoveindex = 0;
    }

    public void printBoard(){
        board.print();
    }

    public void makeMove() throws InvalidMoveException {

        Player currentPlayer = players.get(nextPlayerMoveindex);
        System.out.println("It is " + currentPlayer.getName() + "'s move");

        Move move = currentPlayer.makeMove(board);

        if(!validateMove(move)){
            throw  new InvalidMoveException("Invalid move please try again");
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(currentPlayer);

        Move finalMove = new Move(currentPlayer, cell);
        moves.add(finalMove);

        nextPlayerMoveindex = (nextPlayerMoveindex + 1) % players.size();

        if(checkWinner(finalMove)){
            winner = currentPlayer;
            gameState = GameState.ENDED;
        }else if (moves.size() == board.getDimension() * board.getDimension()){
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Move finalMove) {
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board, finalMove)){
                return true;
            }
        }
        return false;
    }

    private boolean validateMove(Move move) {
        Player player = move.getPlayer();
        Cell cell = move.getCell();
        int row = cell.getRow();
        int col = cell.getCol();

        if(row < 0
                || row >= board.getDimension()
                || col < 0
                || col>= board.getDimension()
                ||board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)){
            return false;
        }
        return true;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveindex() {
        return nextPlayerMoveindex;
    }

    public void setNextPlayerMoveindex(int nextPlayerMoveindex) {
        this.nextPlayerMoveindex = nextPlayerMoveindex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private List<Player> players1;
        private int dimension;
        private List<WinningStrategy> winningStrategies;

        public Builder setPlayers1(List<Player> players1) {
            this.players1 = players1;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies){
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validateBotCount() throws InvalideBotCountException {
            int botcount = 0;
            for(Player player : players1){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botcount +=1;
                }
            }
            if(botcount > 1) {
                throw new InvalideBotCountException("Only 1 bot is allowed per game.");
            }
        }

        private void validatePlayerCount() throws InvalidPlayerCountException {
            if(players1.size() != dimension -1){
                throw new InvalidPlayerCountException("Number of plpayers should be 1 less than the dimension");
            }
        }

        public void validateUniquePlayerSymbols(){

        }

        private void validate() throws InvalideBotCountException, InvalidPlayerCountException {
            validateBotCount();
            validatePlayerCount();
            validateUniquePlayerSymbols();
        }

        public Game build() throws InvalideBotCountException, InvalidPlayerCountException {
            validate();
            return new Game(dimension, players1, winningStrategies);
        }
    }
}
