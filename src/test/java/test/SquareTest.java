package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.board.Square");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe Square");
        }
    }
}