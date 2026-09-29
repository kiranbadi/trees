package dp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPathsTest {

    private ValidPaths validPaths;

    @BeforeEach
    void setUp() {
        validPaths = new ValidPaths();
    }

    @AfterEach
    void tearDown() {
        validPaths = null;
    }

    @Test
    void hasValidPath() {
        char[][] grid1 = {
                {'(', '(', '('},
                {')', '(', ')'},
                {'(', '(', ')'},
                {'(', '(', ')'}
        };
       Assertions.assertTrue(validPaths.hasValidPath(grid1));

        char[][] grid2 = {
                {')', ')'},
                {'(', '('}
        };
        Assertions.assertFalse(validPaths.hasValidPath(grid2));
    }
}