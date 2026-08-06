package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaTest {

    private MaxArea maxArea;

    @BeforeEach
    void setUp() {
        maxArea = new MaxArea();
    }

    @AfterEach
    void tearDown() {
        maxArea = null;
    }

    @Test
    void maxArea() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = maxArea.maxArea(height);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxArea2() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = maxArea.maxArea1(height);
        Assertions.assertEquals(expected, actual);
    }
}