package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberIITest {

    private SingleNumberII singleNumberII;

    @BeforeEach
    void setUp() {
        singleNumberII = new SingleNumberII();
    }

    @AfterEach
    void tearDown() {
        singleNumberII = null;
    }

    @Test
    void singleNumber() {
        int[] nums = {2, 2, 3, 2};
        int expected = 3;
        int actual = singleNumberII.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    void singleNumber2() {
        int[] nums = {2, 2, 3, 2};
        int expected = 3;
        int actual = singleNumberII.singleNumber2(nums);
        assertEquals(expected, actual);
    }
}