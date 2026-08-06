package maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceInArraysTest {

    private DifferenceInArrays differenceInArrays;

    @BeforeEach
    void setUp() {
        differenceInArrays = new DifferenceInArrays();
    }

    @AfterEach
    void tearDown() {
        differenceInArrays = null;
    }

    @Test
    void findDifference() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        List<List<Integer>> result = differenceInArrays.findDifference(nums1, nums2);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
    }
}