package heaps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class KLargestElementTest {

    private KLargestElement klargestElement;

    @BeforeEach
    void setUp() {
        klargestElement = new KLargestElement();
    }

    @AfterEach
    void tearDown() {
        klargestElement = null;
    }

    @Test
    void findKthLargest() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        int actual = klargestElement.findKthLargest(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}