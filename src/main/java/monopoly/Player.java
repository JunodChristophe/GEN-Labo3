package monopoly;

public class Player {
    private Piece piece;
    private MonopolyGame game;
    private Dice dice;
    private Board board;

    public Player(MonopolyGame game, Board board, Dice dice){
        this.piece = new Piece();
        this.dice = dice;
        this.game = game;
        this.board = board;
    }

    public void takeTurn() {
    }
}
