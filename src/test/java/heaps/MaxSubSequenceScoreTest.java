package heaps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubSequenceScoreTest {

    private MaxSubSequenceScore maxSubSequenceScore;

    @BeforeEach
    void setUp() {
        maxSubSequenceScore = new MaxSubSequenceScore();
    }

    @AfterEach
    void tearDown() {
        maxSubSequenceScore = null;
    }

    @Test
    void maxScore() {
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
        Assertions.assertEquals(240, maxSubSequenceScore.maxScore(nums, nums, 5));
    }
}