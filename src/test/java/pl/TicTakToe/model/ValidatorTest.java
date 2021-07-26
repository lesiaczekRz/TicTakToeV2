package pl.TicTakToe.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    @DisplayName("Sprawdza współrzędne")
    void isWrongCoordinate() {
        assertEquals(Validator.isWrongCoordinate('X', 'A'), false, "Błędne współrzędne");
    }

    @Test
    @DisplayName("Sprawdza zajętość pola")
    void checkIfExists() {
        char[][] arrayBoard = new char[3][3];
        arrayBoard[0][0] = 'X';
        assertEquals(Validator.checkIfExists(arrayBoard,0,0), true, "To pole jest już zajęte");
    }
}