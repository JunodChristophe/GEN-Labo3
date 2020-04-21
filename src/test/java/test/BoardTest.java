package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoardTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.board.Board");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe Board");
        }
    }
}