package monopoly;

import java.util.Random;

public class Dice {
    private int faceValue;

    public void roll(){
        this.faceValue = new Random().nextInt(11) + 2;
    }
    public int getFaceValue(){
        return faceValue;
    }
}
