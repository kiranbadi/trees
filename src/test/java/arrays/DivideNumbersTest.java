package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideNumbersTest {

    private DivideNumbers divideNumbers;

    @BeforeEach
    void setUp() {
        divideNumbers = new DivideNumbers();
    }

    @AfterEach
    void tearDown() {
        divideNumbers = null;
    }

    @Test
    void divide() {
        Assertions.assertEquals(3, divideNumbers.divide(10, 3));
        Assertions.assertEquals(-2, divideNumbers.divide(7, -3));
        Assertions.assertEquals(0, divideNumbers.divide(0, 1));
        Assertions.assertEquals(1, divideNumbers.divide(1, 1));
    }
}