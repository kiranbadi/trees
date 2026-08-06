package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    private MoveZeros moveZeros;

    @BeforeEach
    void setUp() {
        moveZeros = new MoveZeros();
    }

    @AfterEach
    void tearDown() {
        moveZeros = null;
    }

    @Test
    void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }
}