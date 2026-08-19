package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimizeResultTest {

    private MinimizeResult minimizeResult;

    @BeforeEach
    void setUp() {
        minimizeResult = new MinimizeResult();
    }

    @AfterEach
    void tearDown() {
        minimizeResult = null;
    }

    @Test
    void minimizeResult() {
        Assertions.assertNotNull(minimizeResult);
        Assertions.assertEquals("1(2+3)4", minimizeResult.minimizeResult("12+34"));
        Assertions.assertEquals("(999+999)", minimizeResult.minimizeResult("999+999"));

    }
}