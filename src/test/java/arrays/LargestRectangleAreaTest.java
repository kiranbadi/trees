package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleAreaTest {

    private LargestRectangleArea largestRectangleArea;

    @BeforeEach
    void setUp() {
        largestRectangleArea = new LargestRectangleArea();
    }

    @AfterEach
    void tearDown() {
        largestRectangleArea = null;
    }

    @Test
    void largestRectangleArea() {
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        Assertions.assertEquals(10, largestRectangleArea.largestRectangleArea(heights1));

        int[] heights2 = {2, 4};
        Assertions.assertEquals(4, largestRectangleArea.largestRectangleArea(heights2));

        int[] heights3 = {0};
        Assertions.assertEquals(0, largestRectangleArea.largestRectangleArea(heights3));

        int[] heights4 = {2, 1, 2};
        Assertions.assertEquals(3, largestRectangleArea.largestRectangleArea(heights4));
    }
}