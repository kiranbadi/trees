package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    private ProductExceptSelf productExceptSelf;

    @BeforeEach
    void setUp() {
        productExceptSelf = new ProductExceptSelf();
    }

    @AfterEach
    void tearDown() {
        productExceptSelf = null;
    }

    @Test
    void productExceptSelf() {
        int[] input = {1, 2, 3, 4};
        int[] expectedOutput = {24, 12, 8, 6};
        int[] actualOutput = productExceptSelf.productExceptSelf(input);
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}