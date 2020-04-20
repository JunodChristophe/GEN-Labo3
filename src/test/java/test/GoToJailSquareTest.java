package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.GoToJailSquareTest");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe GoToJailSquareTest");
        }
    }
}