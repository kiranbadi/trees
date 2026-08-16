package Stacks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @AfterEach
    void tearDown() {
        validParentheses = null;
    }

    @Test
    void isValid() {
        Assertions.assertTrue(validParentheses.isValid("()"));
        Assertions.assertTrue(validParentheses.isValid("()[]{}"));
        Assertions.assertFalse(validParentheses.isValid("(]"));
        Assertions.assertTrue(validParentheses.isValid("([])"));
        Assertions.assertFalse(validParentheses.isValid("([)]"));
    }
}