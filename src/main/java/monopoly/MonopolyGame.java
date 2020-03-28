package monopoly;

import java.util.Set;

public class MonopolyGame {
    private final int MAX_ROUNDS = 20;
    private int roundCount;
    private Set<Player> players;
    private Board playedOn;
    private Dice playerWith;

    public MonopolyGame(){
        this.roundCount = 0;
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