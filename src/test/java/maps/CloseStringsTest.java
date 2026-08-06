package maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloseStringsTest {

    private CloseStrings closeStrings;

    @BeforeEach
    void setUp() {
        closeStrings = new CloseStrings();
    }

    @AfterEach
    void tearDown() {
        closeStrings = null;
    }

    @Test
    void closeStrings() {
        Assertions.assertTrue(closeStrings.closeStrings("abc", "bca"));
    }
}