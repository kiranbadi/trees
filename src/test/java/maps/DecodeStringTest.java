package maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    private DecodeString decodeString;

    @BeforeEach
    void setUp() {
        decodeString = new DecodeString();
    }

    @AfterEach
    void tearDown() {
        decodeString = null;
    }

    @Test
    void decodeString() {
        Assertions.assertNotNull(decodeString);
        Assertions.assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
    }
}