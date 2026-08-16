package Stacks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    private EvaluateReversePolishNotation evaluateReversePolishNotation;

    @BeforeEach
    void setUp() {
        evaluateReversePolishNotation = new EvaluateReversePolishNotation();
    }

    @AfterEach
    void tearDown() {
        evaluateReversePolishNotation = null;
    }

    @Test
    void evalRPN() {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        Assertions.assertEquals(9, evaluateReversePolishNotation.evalRPN(tokens1));

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        Assertions.assertEquals(6, evaluateReversePolishNotation.evalRPN(tokens2));

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Assertions.assertEquals(22, evaluateReversePolishNotation.evalRPN(tokens3));


    }
}