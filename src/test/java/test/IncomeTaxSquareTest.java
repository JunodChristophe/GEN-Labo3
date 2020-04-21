package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IncomeTaxSquareTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.board.IncomeTaxSquare");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe IncomeTaxSquare");
        }
    }
}