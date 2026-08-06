package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    private CanPlaceFlowers canPlaceFlowers;

    @BeforeEach
    void setUp() {
        canPlaceFlowers = new CanPlaceFlowers();
    }

    @AfterEach
    void tearDown() {
        canPlaceFlowers = null;
    }

    @Test
    void canPlaceFlowers() {
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        Assertions.assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        Assertions.assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2));
    }
}