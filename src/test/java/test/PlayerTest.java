package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.Player");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe Player");
        }
    }
}