package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxDistanceTest {

    private MaxDistance maxDistance;

    @BeforeEach
    void setUp() {
        maxDistance = new MaxDistance();
    }

    @AfterEach
    void tearDown() {
        maxDistance = null;
    }

    @Test
    void maxDistance() {
        int side = 2;
        int[][] points = {{0, 0}, {1, 2}, {2, 0}, {2, 2},{2,1}};
        int k = 4;
        int expected = 1;
        int actual = maxDistance.maxDistance(side, points, k);
        Assertions.assertEquals(expected, actual);
    }
}