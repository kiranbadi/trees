package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GCDOfStringsTest {

    private GCDOfStrings gcdOfStrings;

    @BeforeEach
    void setUp() {
        gcdOfStrings = new GCDOfStrings();
    }

    @AfterEach
    void tearDown() {
        gcdOfStrings = null;
    }

    @ParameterizedTest
    @CsvSource({
            "abc,abc,abc",
            "abcd,abcd,abcd",
            "abc,ab,''",
            "ab,abc,''",
            "a,a,a"
    })
    void gcdOfStrings(String word1, String word2, String expected) {
        String result = gcdOfStrings.gcdOfStrings(word1, word2);
        Assertions.assertEquals(expected, result);
    }
}