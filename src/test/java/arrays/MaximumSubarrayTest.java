package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @BeforeEach
    void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @AfterEach
    void tearDown() {
        maximumSubarray = null;
    }

    @Test
    void maxSubArray() {
        Assertions.assertNotNull(maximumSubarray);
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected1 = 6;
        int result1 = maximumSubarray.maxSubArray(nums1);
        Assertions.assertEquals(expected1, result1);
    }
}