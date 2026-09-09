package String;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountCommasTest {

    private CountCommas countCommas;

    @BeforeEach
    void setUp() {
        countCommas = new CountCommas();
    }

    @AfterEach
    void tearDown() {
        countCommas = null;
    }

    @Test
    void countCommas() {
        Assertions.assertEquals(3, countCommas.countCommas(1002));
        Assertions.assertEquals(0, countCommas.countCommas(998));
        Assertions.assertEquals(1, countCommas.countCommas(1000));
        Assertions.assertEquals(9000, countCommas.countCommas(9999));

    }

    @Test
    void countCommas2() {
        Assertions.assertEquals(1008182, countCommas.countIntCommas(1004590));
    }
}