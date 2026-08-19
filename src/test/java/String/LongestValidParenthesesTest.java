package String;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    private LongestValidParentheses longestValidParentheses;

    @BeforeEach
    void setUp() {
        longestValidParentheses = new LongestValidParentheses();
    }

    @AfterEach
    void tearDown() {
        longestValidParentheses = null;
    }

    @Test
    void longestValidParentheses() {
        Assertions.assertEquals(2, longestValidParentheses.longestValidParentheses("()"));
        Assertions.assertEquals(2, longestValidParentheses.longestValidParentheses("(()"));
        Assertions.assertEquals(4, longestValidParentheses.longestValidParentheses(")()())"));
        Assertions.assertEquals(0, longestValidParentheses.longestValidParentheses(""));
    }
}