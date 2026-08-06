package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotIndexTest {

    private PivotIndex pivotIndex;

    @BeforeEach
    void setUp() {
        pivotIndex = new PivotIndex();
    }

    @AfterEach
    void tearDown() {
        pivotIndex = null;
    }

    @Test
    void pivotIndex() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int expected = 3;
        int actual = pivotIndex.pivotIndex(nums);
        assertEquals(expected, actual);
    }
}