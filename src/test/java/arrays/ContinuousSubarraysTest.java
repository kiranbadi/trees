package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinuousSubarraysTest {

    private ContinuousSubarrays continuousSubarrays;

    @BeforeEach
    void setUp() {
        continuousSubarrays = new ContinuousSubarrays();
    }

    @AfterEach
    void tearDown() {
        continuousSubarrays = null;
    }

    @Test
    void continuousSubarrays() {
        Assertions.assertNotNull(continuousSubarrays);
        Assertions.assertEquals(8, continuousSubarrays.continuousSubarrays(new int[]{5, 4, 2, 4}));
        Assertions.assertEquals(6, continuousSubarrays.continuousSubarrays(new int[]{1, 2, 3}));
        Assertions.assertEquals(1, continuousSubarrays.continuousSubarrays(new int[]{1}));
    }
}