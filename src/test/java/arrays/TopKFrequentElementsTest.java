package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    private TopKFrequentElements topKFrequentElements;


    @BeforeEach
    public void setUp() {
        topKFrequentElements = new TopKFrequentElements();
    }

    @AfterEach
    public void tearDown() {
        topKFrequentElements = null;
    }

    @Test
    void topKFrequent() {
        int[] nums = {100,100,100,2,2,3};
        int k = 2;
        int[] expected = {100, 2};
        int[] result = topKFrequentElements.topKFrequent(nums, k);
        assertArrayEquals(expected, result);
    }
}