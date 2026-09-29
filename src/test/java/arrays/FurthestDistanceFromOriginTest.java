package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurthestDistanceFromOriginTest {

    private FurthestDistanceFromOrigin furthestDistanceFromOrigin;

    @BeforeEach
    void setUp() {
        furthestDistanceFromOrigin = new FurthestDistanceFromOrigin();
    }

    @AfterEach
    void tearDown() {
        furthestDistanceFromOrigin = null;
    }

    @Test
    void furthestDistanceFromOrigin() {
        Assertions.assertEquals(3, furthestDistanceFromOrigin.furthestDistanceFromOrigin("L_RL__R"));
        Assertions.assertEquals(5, furthestDistanceFromOrigin.furthestDistanceFromOrigin("_R__LL_"));
    }
}