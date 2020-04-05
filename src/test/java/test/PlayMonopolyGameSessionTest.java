package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayMonopolyGameSessionTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.PlayMonopolyGameSession");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe PlayMonopolyGameSession");
        }
    }
}