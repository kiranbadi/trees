package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsIITest {

    private  SubsetsII subsetsII;

    @BeforeEach
    void setUp() {
        subsetsII = new SubsetsII();
    }

    @AfterEach
    void tearDown() {
        subsetsII = null;
    }

    @Test
    void subsetsWithDup() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(1, 2),
                List.of(1, 2, 2),
                List.of(2),
                List.of(2, 2)
        );
        assertEquals(expected, subsetsII.subsetsWithDup(nums));
    }
}