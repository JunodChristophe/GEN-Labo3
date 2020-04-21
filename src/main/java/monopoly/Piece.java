package monopoly;

import monopoly.board.Square;

public class Piece {
    private Square location;

    Piece(Square originLocation) {
        this.location = originLocation;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
