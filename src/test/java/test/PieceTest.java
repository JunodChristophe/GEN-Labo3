package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.Piece");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe Piece");
        }
    }
}