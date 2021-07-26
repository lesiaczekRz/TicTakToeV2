package pl.TicTakToe.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinTest {

    private Win win;

    @BeforeEach
    void setUp() {
        Win win = new Win();
    }

    @Test
    void isWin() {
        char[][] arrayBoard = new char[3][3];
        arrayBoard[0][0] = 'X';
        arrayBoard[1][1] = 'X';
        arrayBoard[2][2] = 'X';
        assertEquals(win.isWin(arrayBoard), true, "Czy wygrał");
    }
}