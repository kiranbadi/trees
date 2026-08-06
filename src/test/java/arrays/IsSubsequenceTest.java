package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    private IsSubsequence isSubsequence;
    @BeforeEach
    void setUp() {
        isSubsequence = new IsSubsequence();
    }

    @AfterEach
    void tearDown() {
        isSubsequence = null;
    }

    @Test
    void isSubsequence() {
        IsSubsequence isSubsequence = new IsSubsequence();
        Assertions.assertTrue(isSubsequence.isSubsequence("abc", "ahbgdc"));
        Assertions.assertFalse(isSubsequence.isSubsequence("axc", "ahbgdc"));
    }
}