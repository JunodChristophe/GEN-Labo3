package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.GoSquare");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe GoSquare");
        }
    }
}