package Stacks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private BasicCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new BasicCalculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void calculate() {
        Assertions.assertEquals(2, calculator.calculate("1 + 1"));
        Assertions.assertEquals(3, calculator.calculate(" 2-1 + 2 "));
        Assertions.assertEquals(23, calculator.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}