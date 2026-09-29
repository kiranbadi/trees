package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseDegreeTest {

    private ReverseDegree reverseDegree;

    @BeforeEach
    void setUp() {
        reverseDegree = new ReverseDegree();
    }

    @AfterEach
    void tearDown() {
        reverseDegree = null;
    }

    @Test
    void reverseDegree() {
        Assertions.assertEquals(26, reverseDegree.reverseDegree("a"));
        Assertions.assertEquals(76, reverseDegree.reverseDegree("ab"));

    }
}