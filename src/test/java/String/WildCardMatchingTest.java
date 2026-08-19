package String;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WildCardMatchingTest {

    private WildCardMatching wildCardMatching;

    @BeforeEach
    void setUp() {
        wildCardMatching = new WildCardMatching();
    }

    @AfterEach
    void tearDown() {
        wildCardMatching= null;
    }

    @Test
    void isMatch() {
        Assertions.assertTrue(wildCardMatching.isMatch("aa", "*"));
        Assertions.assertFalse(wildCardMatching.isMatch("aa", "a"));
        Assertions.assertFalse(wildCardMatching.isMatch("cb", "?a"));
        Assertions.assertTrue(wildCardMatching.isMatch("adceb", "*a*b"));
        Assertions.assertFalse(wildCardMatching.isMatch("acdcb", "a*c?b"));
    }
}