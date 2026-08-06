package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    private StringCompression stringCompression;

    @BeforeEach
    void setUp() {
        stringCompression = new StringCompression();
    }

    @AfterEach
    void tearDown() {
        stringCompression = null;
    }

    @Test
    void compress() {
        String input = "abcde";
        char[] chars = input.toCharArray();
        int expectedLength = 5;
        int actualLength = stringCompression.compress(chars);
        assertEquals(expectedLength, actualLength);
    }
}