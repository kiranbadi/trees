package heaps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuccessfulPairsTest {

    private SuccessfulPairs successfulPairs;

    @BeforeEach
    void setUp() {
        successfulPairs = new SuccessfulPairs();
    }

    @AfterEach
    void tearDown() {
        successfulPairs = null;
    }

    @Test
    void successfulPairs() {
        int[] spells = new int[] {1,2,3};
        int[] potions = new int[] {3,4,5};
        int success = 3;
        int[] expected = new int[] {2,1,1};
        int[] actual = successfulPairs.successfulPairs(spells, potions, success);
        Assertions.assertEquals(expected.length, actual.length);
    }
}