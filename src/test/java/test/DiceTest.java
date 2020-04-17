package test;

import monopoly.Dice;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DiceTest {
    private int MAX_FACE_VALUE = 12;
    private int MIN_FACE_VALUE = 2;
    private Dice dice;

    @BeforeAll
    void init(){
        System.out.println("Vérification de l'existance de la class et initialisation");
        try {
            Class.forName("monopoly.Dice");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la Dice Board");
        }
        dice = new Dice();
    }

    @RepeatedTest(20)
    void testRoll(){
        System.out.println("Execution du test répété sur roll");
        dice.roll();
        System.out.println("Face Value : " + dice.getFaceValue() + " | MIN : " + MIN_FACE_VALUE + " MAX : " + MAX_FACE_VALUE );
        Assertions.assertFalse( dice.getFaceValue() > MAX_FACE_VALUE, "Error, roll to high");
        Assertions.assertFalse( dice.getFaceValue() < MIN_FACE_VALUE, "Error, roll to low");
    }
}