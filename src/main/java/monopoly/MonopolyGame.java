package monopoly;

import java.util.Random;
import java.util.Set;

public class MonopolyGame {
    private final int MAX_ROUNDS = 20;
    private int roundCount;
    private Set<Player> players;
    private Board board;
    private Dice dice;

    public MonopolyGame(){
        this.roundCount = 0;
        this.dice = new Dice();
        this.board = new Board();
        int numberOfPlayers = new Random().nextInt(7) + 2;
        for(int i = 0; i < numberOfPlayers; ++i) players.add(new Player(this, board, dice));
    }
    
    public void playGame(){
        for(int round = 0; round < this.MAX_ROUNDS; ++round){
            this.playRound();
        }
    }

    private void playRound(){
        for(Player player : this.players){
            player.takeTurn();
        }
    }

    public static void main(String... args){
                                    
    }


}