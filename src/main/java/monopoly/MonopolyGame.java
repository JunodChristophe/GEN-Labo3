package monopoly;

import monopoly.board.Board;

import java.util.ArrayList;

public class MonopolyGame {
    private final int MAX_ROUNDS = 20;
    private int roundCount;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Board board;
    private Dice[] dices;

    public MonopolyGame(int nbPlayer){
        //Run the game as a simulation requiring no user input, other than the number of
        //players.
        if(nbPlayer < 2 || nbPlayer > 8) {
            throw new RuntimeException("Number must be between 2 and 8");
        }
        this.roundCount = 0;
        this.dices = new Dice[]{new Dice(), new Dice()};
        this.board = new Board(40);
        for(int i = 0; i < nbPlayer; ++i) {
            players.add(new Player(board, dices, i+1));
        }
    }
    
    public void playGame(){
        System.out.println("New Game");
        System.out.println("Number of player : " + players.size());
        System.out.println("Game Start");
        for(roundCount = 0; roundCount < this.MAX_ROUNDS; ++roundCount){
            System.out.println("\nRound : " + roundCount);
            this.playRound();
        }
        System.out.println("Game Over");
    }

    private void playRound(){
        for(Player player : this.players){
            player.takeTurn();
        }
    }

    public static void main(String... args){
        MonopolyGame MpG = new MonopolyGame(Integer.parseInt(args[0]));
        MpG.playGame();
    }
}