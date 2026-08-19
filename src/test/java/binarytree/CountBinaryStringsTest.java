package binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountBinaryStringsTest {

    private CountBinaryStrings countBinaryStrings;

    @BeforeEach
    void setUp() {
        countBinaryStrings = new CountBinaryStrings();
    }

    @AfterEach
    void tearDown() {
        countBinaryStrings = null;
    }

    @Test
    void countBinarySubstrings() {
        Assertions.assertEquals(6, countBinaryStrings.countBinarySubstrings("00110011"));
        Assertions.assertEquals(4, countBinaryStrings.countBinarySubstrings("10101"));
        Assertions.assertEquals(0, countBinaryStrings.countBinarySubstrings("0000"));
        Assertions.assertEquals(0, countBinaryStrings.countBinarySubstrings("1111"));
        Assertions.assertEquals(1, countBinaryStrings.countBinarySubstrings("01"));
        Assertions.assertEquals(1, countBinaryStrings.countBinarySubstrings("10"));
        Assertions.assertEquals(2, countBinaryStrings.countBinarySubstrings("0011"));
        Assertions.assertEquals(2, countBinaryStrings.countBinarySubstrings("1100"));
    }
}