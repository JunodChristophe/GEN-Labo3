package monopoly;

import java.awt.*;

public class Player {
    private Piece piece;
    private MonopolyGame game;
    private Dice dice;
    private Board board;
    private int cash;

    public Player(MonopolyGame game, Board board, Dice dice){
        this.piece = new Piece();
        this.dice = dice;
        this.game = game;
        this.board = board;
        this.cash = 1500;
    }

    public void addCash(int income) {
        this.cash += income;
    }

    public void takeTurn() {
    }


    public int getNetWorth() {
        return cash;
    }

    //What if 0$ left ?
    public void reduceCash(int money) {
        this.cash -= money;
    }

    public Piece getPiece() {
        return piece;
    }
}
