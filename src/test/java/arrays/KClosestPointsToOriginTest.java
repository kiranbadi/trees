package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestPointsToOriginTest {

    private KClosestPointsToOrigin kClosestPointsToOrigin;

    @BeforeEach
    void setUp() {
        kClosestPointsToOrigin = new KClosestPointsToOrigin();
    }

    @AfterEach
    void tearDown() {
        kClosestPointsToOrigin = null;
    }

    @Test
    void kClosest() {
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;
        int[][] expected = {{-2, 2}};
        Assertions.assertArrayEquals(expected, kClosestPointsToOrigin.kClosest(points, k));

        points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        k = 2;
        expected = new int[][]{{3, 3}, {-2, 4}};
        Assertions.assertArrayEquals(expected, kClosestPointsToOrigin.kClosest(points, k));
    }
}