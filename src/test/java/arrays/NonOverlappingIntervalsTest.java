package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NonOverlappingIntervalsTest {

    private NonOverlappingIntervals nonOverlappingIntervals;

    @BeforeEach
    void setUp() {
        nonOverlappingIntervals = new NonOverlappingIntervals();
    }

    @AfterEach
    void tearDown() {
        nonOverlappingIntervals = null;
    }

    @Test
    void eraseOverlapIntervals() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int expected = 1;
        int actual = nonOverlappingIntervals.eraseOverlapIntervals(intervals);
        Assertions.assertEquals(expected, actual);
    }
}