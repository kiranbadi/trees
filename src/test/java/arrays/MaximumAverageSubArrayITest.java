package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubArrayITest {

    private MaximumAverageSubArrayI maximumAverageSubArrayI;

    @BeforeEach
    void setUp() {
        maximumAverageSubArrayI = new MaximumAverageSubArrayI();
    }

    @AfterEach
    void tearDown() {
        maximumAverageSubArrayI = null;
    }

    @Test
    void findMaxAverage() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75;
        double actual = maximumAverageSubArrayI.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }
}