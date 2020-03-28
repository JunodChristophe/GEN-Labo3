package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.Dice");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la Dice Board");
        }
    }
}