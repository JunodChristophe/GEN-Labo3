package monopoly.board;

import java.util.ArrayList;

public class  Board {
    private ArrayList<Square> squares;
    private String name;

    public Board(int size){
        this.squares = new ArrayList<Square>(size);
        squares.add(0, new Square("Go"));
        for (int i = 1; i < size + 1; ++i) {
            squares.add(i, new Square("Square " + i));
        }
    }

    // Position relatif
    public Square getSquare(Square originLocation, int valueOffset) {
        return this.getSquare((squares.indexOf(originLocation) + valueOffset) % squares.size());
    }

    // Position absolue
    public Square getSquare(int num) {
        return squares.get(num);
    }
}
