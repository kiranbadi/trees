package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinArrowsToBurstBalloonsTest {

    private MinArrowsToBurstBalloons minArrowsToBurstBalloons;

    @BeforeEach
    void setUp() {
        minArrowsToBurstBalloons = new MinArrowsToBurstBalloons();
    }

    @AfterEach
    void tearDown() {
        minArrowsToBurstBalloons = null;
    }

    @Test
    void findMinArrowShots() {
        int[][] points1 = {{10,16},{2,8},{1,6},{7,12}};
        Assertions.assertEquals(2, minArrowsToBurstBalloons.findMinArrowShots(points1));

        int[][] points2 = {{1,2},{3,4},{5,6},{7,8}};
        Assertions.assertEquals(4, minArrowsToBurstBalloons.findMinArrowShots(points2));

        int[][] points3 = {{1,2},{2,3},{3,4},{4,5}};
        Assertions.assertEquals(2, minArrowsToBurstBalloons.findMinArrowShots(points3));
    }
}