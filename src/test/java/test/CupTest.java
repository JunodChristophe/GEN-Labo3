package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    @Test
    void testClassExist(){
        try {
            Class.forName("monopoly.CupTest");
        } catch (ClassNotFoundException e) {
            Assertions.fail("Manque la classe CupTest");
        }
    }
}