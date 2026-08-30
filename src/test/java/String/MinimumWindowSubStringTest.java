package String;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubStringTest {

    private MinimumWindowSubString minimumWindowSubString;

    @BeforeEach
    void setUp() {
        minimumWindowSubString = new MinimumWindowSubString();
    }

    @AfterEach
    void tearDown() {
        minimumWindowSubString = null;
    }

    @Test
    void minWindow() {
        Assertions.assertEquals("BANC", minimumWindowSubString.minWindow("ADOBECODEBANC", "ABC"));
        Assertions.assertEquals("a", minimumWindowSubString.minWindow("a", "a"));
        Assertions.assertEquals("", minimumWindowSubString.minWindow("a", "aa"));
    }
}