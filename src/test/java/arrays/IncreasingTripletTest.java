package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletTest {

    private IncreasingTriplet increasingTriplet;

    @BeforeEach
    void setUp() {
        increasingTriplet = new IncreasingTriplet();
    }

    @AfterEach
    void tearDown() {
        increasingTriplet = null;
    }

    @Test
    void increasingTriplet() {
        boolean expectedOutput = true;
        boolean actualOutput = increasingTriplet.increasingTriplet(new int[]{1, 2, 3});
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}