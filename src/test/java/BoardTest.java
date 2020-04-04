package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.Board2");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe Board");
        }
    }
}