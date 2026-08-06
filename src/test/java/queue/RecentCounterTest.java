package queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecentCounterTest {

    private RecentCounter recentCounter;

    @BeforeEach
    void setUp() {
        recentCounter = new RecentCounter();
    }

    @AfterEach
    void tearDown() {
        recentCounter = null;
    }

    @Test
    void ping() {
        recentCounter.ping(1);
        recentCounter.ping(2);
        recentCounter.ping(3);
        recentCounter.ping(4);
    }
}