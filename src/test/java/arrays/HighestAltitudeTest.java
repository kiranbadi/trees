package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestAltitudeTest {

    private HighestAltitude highestAltitude;

    @BeforeEach
    void setUp() {
        highestAltitude = new HighestAltitude();
    }

    @AfterEach
    void tearDown() {
        highestAltitude = null;
    }

    @Test
    void largestAltitude() {
        int[] gain = {-5, 1, 5, 0, -7};
        int expected = 1;
        int actual = highestAltitude.largestAltitude(gain);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void largestAltitude1() {
        int[] gain = {-5, 1, 5, 0, -7};
        int expected = 1;
        int actual = highestAltitude.largestAltitude(gain);
        Assertions.assertEquals(expected, actual);
    }
}