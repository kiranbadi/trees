package maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualPairsTest {

    private EqualPairs equalPairs;

    @BeforeEach
    void setUp() {
        equalPairs = new EqualPairs();
    }

    @AfterEach
    void tearDown() {
        equalPairs = null;
    }

    @Test
    void equalPairs() {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        int expected = 1;
        int actual = equalPairs.equalPairs(grid);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void equalPairs1() {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        int expected = 3;
        int actual = equalPairs.equalPairs1(grid);
        Assertions.assertEquals(expected, actual);
    }
}