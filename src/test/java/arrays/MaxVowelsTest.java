package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxVowelsTest {

    private MaxVowels maxVowels;

    @BeforeEach
    void setUp() {
        maxVowels = new MaxVowels();
    }

    @AfterEach
    void tearDown() {
        maxVowels = null;
    }

    @Test
    void maxVowels() {
        Assertions.assertEquals(3, maxVowels.maxVowels("abciiidef", 3));
        Assertions.assertEquals(2, maxVowels.maxVowels("aeiou", 2));
        Assertions.assertEquals(2, maxVowels.maxVowels("leetcode", 3));
    }
}