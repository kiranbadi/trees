package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumProcessingTimeTest {

    private MinimumProcessingTime minimumProcessingTime;

    @BeforeEach
    void setUp() {
        minimumProcessingTime = new MinimumProcessingTime();
    }

    @AfterEach
    void tearDown() {
        minimumProcessingTime = null;
    }

    @Test
    void minProcessingTime() {
        // use mutable lists for testing
        List<Integer> processorTime1 = new ArrayList<>();
        processorTime1.add(1);
        processorTime1.add(2);
        List<Integer> tasks1 = new ArrayList<>();
        tasks1.add(3);
        tasks1.add(4);
        tasks1.add(5);
        tasks1.add(6);
        Assertions.assertEquals(11, minimumProcessingTime.minProcessingTime(processorTime1, tasks1));
    }
}