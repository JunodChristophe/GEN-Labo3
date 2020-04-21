package monopoly;

import monopoly.board.Board;
import monopoly.board.Square;

public class Player {
    private Piece piece;
    private Dice[] dices;
    private Board board;
    private int cash;
    private String name;

    public Player(Board board, Dice[] dices, int numPlayer){
        this.piece = new Piece(board.getSquare(0));
        this.dices = dices;
        this.board = board;
        this.cash = 1500;
        this.name = "Player " + numPlayer;
        this.piece = new Piece(board.getSquare(0));
    }

    public void addCash(int income) {
        this.cash += income;
    }

    public void takeTurn() {
        int fv, fvTot = 0;
        for (Dice dice : dices) {
            dice.roll();
            fv = dice.getFaceValue();
            fvTot += fv;
        }
        System.out.println(name + " rolled " + fvTot);
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
        System.out.println(name + " landed on " + piece.getLocation().getName());
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
