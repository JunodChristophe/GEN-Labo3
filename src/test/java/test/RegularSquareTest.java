package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularSquareTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.RegularSquare");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe RegularSquare");
        }
    }


}