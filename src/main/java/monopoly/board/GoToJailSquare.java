package monopoly.board;

import monopoly.Player;

public class GoToJailSquare extends Square {

    public GoToJailSquare(String name) {
        super(name);
    }

    //?????????????
    /*@Override
    public void landedOn(Player player) {
        player.getPiece().setLocation(new Square("No idea") {
            @Override
            public void landedOn(Player player) {

            }
        });
    }*/
}
