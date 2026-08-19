package String;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumStepsTest {

    private MinimumSteps minimumSteps;

    @BeforeEach
    void setUp() {
        minimumSteps = new MinimumSteps();
    }

    @AfterEach
    void tearDown() {
        minimumSteps = null;
    }

    @Test
    void minSteps() {

       Assertions.assertEquals(1, minimumSteps.minSteps("bab", "aba"));
        Assertions.assertEquals(5, minimumSteps.minSteps("leetcode", "practice"));
        Assertions.assertEquals(0, minimumSteps.minSteps("anagram", "mangaar"));
    }
}