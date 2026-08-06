package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {

    private ReverseVowels reverseVowels;

    @BeforeEach
    void setUp() {
        reverseVowels = new ReverseVowels();
    }

    @AfterEach
    void tearDown() {
        reverseVowels = null;
    }

    @Test
    void reverseVowels() {
      Assertions.assertEquals("AceCreIm", reverseVowels.reverseVowels("IceCreAm"));
    }
}