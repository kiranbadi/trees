package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceCircularArrayTest {

    private MinimumDistanceCircularArray minimumDistanceCircularArray;

    @BeforeEach
    void setUp() {
        minimumDistanceCircularArray = new MinimumDistanceCircularArray();
    }

    @AfterEach
    void tearDown() {
        minimumDistanceCircularArray = null;
    }

    @Test
    void closestTarget() {
        Assertions.assertEquals(1, minimumDistanceCircularArray.closestTarget(new String[]{"hello","i","am","leetcode","hello"}, "hello", 1));
    }
}