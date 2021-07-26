package pl.TicTakToe.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void isWrongCoordinate() {
        assertTrue(Validator.isWrongCoordinate('X', 'A'), "Test");
    }

    @Test
    void checkIfExists() {
    }
}