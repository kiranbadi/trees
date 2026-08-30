package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDeletionsTest {

    private MinimumDeletions minimumDeletions ;

    @BeforeEach
    void setUp() {
        minimumDeletions = new MinimumDeletions();
    }

    @AfterEach
    void tearDown() {
        minimumDeletions = null;
    }

    @Test
    void minimumDeletions() {

        int[] nums1 = {2, 10, 7, 5, 4, 1, 8, 6};
        Assertions.assertEquals(5, minimumDeletions.minimumDeletions(nums1));

        int[] nums2 = {0, -4, 19, 1, 8, -2, -3, 5};
        Assertions.assertEquals(3, minimumDeletions.minimumDeletions(nums2));

        int[] nums3 = {101};
        Assertions.assertEquals(1, minimumDeletions.minimumDeletions(nums3));
    }
}