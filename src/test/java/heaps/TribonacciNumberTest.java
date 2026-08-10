package heaps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciNumberTest {

    private TribonacciNumber tribonacciNumber;

    @BeforeEach
    void setUp() {
        tribonacciNumber = new TribonacciNumber();
    }

    @AfterEach
    void tearDown() {
        tribonacciNumber = null;
    }

    @Test
    void tribonacci() {
        Assertions.assertEquals(0, tribonacciNumber.tribonacci(0));
        Assertions.assertEquals(1, tribonacciNumber.tribonacci(1));
        Assertions.assertEquals(1, tribonacciNumber.tribonacci(2));
        Assertions.assertEquals(2, tribonacciNumber.tribonacci(3));
    }
}