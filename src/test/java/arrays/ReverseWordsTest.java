package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    private ReverseWords reverseWords;

    @BeforeEach
    void setUp() {
        reverseWords = new ReverseWords();
    }

    @AfterEach
    void tearDown() {
        reverseWords = null;
    }

    @Test
    void reverseWords() {
        String input = "Hello World";
        String expectedOutput = "World Hello";
        String actualOutput = reverseWords.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }
}