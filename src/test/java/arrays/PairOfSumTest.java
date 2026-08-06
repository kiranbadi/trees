package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairOfSumTest {

    private PairOfSum pairOfSum;

    @BeforeEach
    void setUp() {
        pairOfSum = new PairOfSum();
    }

    @AfterEach
    void tearDown() {
        pairOfSum = null;
    }

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = pairOfSum.twoSum(nums, target);
        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(2, result[1]);
    }
}