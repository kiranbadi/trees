package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestOnesTest {

    private LongestOnes longestOnes;

    @BeforeEach
    void setUp() {
        longestOnes = new LongestOnes();
    }

    @AfterEach
    void tearDown() {
        longestOnes = null;
    }

    @Test
    void longestOnes() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int expected = 6;
        int actual = longestOnes.longestOnes(nums, k);
        assertEquals(expected, actual);
    }
}