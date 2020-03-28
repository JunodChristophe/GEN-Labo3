package test;

import monopoly.MonopolyGame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MonopolyGameTest {

    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.MonopolyGame");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe MonopolyGame");
        }
    }



}