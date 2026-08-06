package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionTest {

    private SurroundedRegion surroundedRegion;

    @BeforeEach
    void setUp() {
        surroundedRegion = new SurroundedRegion();
    }

    @AfterEach
    void tearDown() {
        surroundedRegion = null;
    }

    @Test
    void solve() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
      surroundedRegion.solve(board);
      assertTrue(Arrays.deepEquals(new char[][]{
              {'X', 'X', 'X', 'X'},
              {'X', 'X', 'X', 'X'},
              {'X', 'X', 'X', 'X'},
              {'X', 'O', 'X', 'X'}
      }, board));
    }
}