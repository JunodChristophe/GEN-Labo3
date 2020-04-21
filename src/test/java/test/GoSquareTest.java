package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GoSquareTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.board.GoSquare");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe GoSquare");
        }
    }
}