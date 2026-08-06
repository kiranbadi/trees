package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeStringsTest {

    private MergeStrings mergeStrings;

    @BeforeEach
    void setUp() {
        mergeStrings = new MergeStrings();
    }

    @AfterEach
    void tearDown() {
        mergeStrings = null;
    }

    @Test
    void mergeAlternately() {
        String word1 = "hello";
        String word2 = "world";
        String result = mergeStrings.mergeAlternately(word1, word2);
        Assertions.assertEquals("hweolrllod", result);

    }
}