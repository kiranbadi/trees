package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithCandiesTest {

    private KidsWithCandies kidsWithCandies;

    @BeforeEach
    void setUp() {
        kidsWithCandies = new KidsWithCandies();
    }

    @AfterEach
    void tearDown() {
        kidsWithCandies = null;
    }

    @Test
    void kidsWithCandies() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = Arrays.asList(true, true, true, false, true);
        List<Boolean> actual = kidsWithCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(expected, actual);
    }
}