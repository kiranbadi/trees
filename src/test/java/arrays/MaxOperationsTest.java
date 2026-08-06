package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxOperationsTest {

    private MaxOperations maxOperations ;

    @BeforeEach
    void setUp() {
        maxOperations = new MaxOperations();
    }

    @AfterEach
    void tearDown() {
        maxOperations = null;
    }

    @Test
    void maxOperations() {
        int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k = 2;
        int expected = 2;
        int actual = maxOperations.maxOperations(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void maxOperations2() {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int expected = 2;
        int actual = maxOperations.maxOperations2(nums, k);
    }
}