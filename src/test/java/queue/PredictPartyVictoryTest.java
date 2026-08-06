package queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredictPartyVictoryTest {

    private PredictPartyVictory predictPartyVictory;

    @BeforeEach
    void setUp() {
        predictPartyVictory = new PredictPartyVictory();
    }

    @AfterEach
    void tearDown() {
        predictPartyVictory = null;
    }

    @Test
    void predictPartyVictory() {
        String senate = "RD";
        String expected = "Radiant";
        String actual = predictPartyVictory.predictPartyVictory(senate);
        Assertions.assertEquals(expected, actual);
    }
}