package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceTest {

    private MinimumDistance minimumDistance;

    @BeforeEach
    void setUp() {
        minimumDistance = new MinimumDistance();
    }

    @AfterEach
    void tearDown() {
        minimumDistance = null;
    }

    @Test
    void getMinDistance() {
        Assertions.assertNotNull(minimumDistance);
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 5;
        int start1 = 3;
        int expected1 = 1;
        int result1 = minimumDistance.getMinDistance(nums1, target1, start1);
        Assertions.assertEquals(expected1, result1);
    }
}