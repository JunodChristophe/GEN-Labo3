package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegularSquareTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.board.RegularSquare");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe RegularSquare");
        }
    }


}