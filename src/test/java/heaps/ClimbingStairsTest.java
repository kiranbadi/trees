package heaps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private ClimbingStairs climbingStairs;

    @BeforeEach
    void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @AfterEach
    void tearDown() {
        climbingStairs = null;
    }

    @Test
    void minCostClimbingStairs() {
        int[] cost = {10, 15, 20};
        int expected = 15;
        int actual = climbingStairs.minCostClimbingStairs(cost);
        Assertions.assertEquals(expected, actual);
    }
}