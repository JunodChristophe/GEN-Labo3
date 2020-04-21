package monopoly;

import java.util.Random;

public class Dice {
    private int faceValue;

    public void roll(){
        this.faceValue = new Random().nextInt(6) + 1;
    }

    public int getFaceValue(){
        return faceValue;
    }
}
