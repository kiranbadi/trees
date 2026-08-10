package heaps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {

    private GuessGame game;

    @BeforeEach
    void setUp() {
        game = new GuessGame(5);
    }

    @AfterEach
    void tearDown() {
        game = null;
    }

    @Test
    void guessNumber() {
        int number = game.guessNumber(5);
        Assertions.assertTrue(number >= 1 && number <= 100);
    }

    @Test
    void guess() {
        int result = game.guess(50);
        Assertions.assertTrue(result == 0 || result == -1 || result == 1);
    }
}