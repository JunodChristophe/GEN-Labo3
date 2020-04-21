package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GoToJailSquareTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.board.GoToJailSquare");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe GoToJailSquare");
        }
    }
}