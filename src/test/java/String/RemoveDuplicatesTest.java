package String;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }

    @AfterEach
    void tearDown() {
        removeDuplicates = null;
    }

    @Test
    void removeDuplicates() {
        Assertions.assertEquals("ca", removeDuplicates.removeDuplicates("abbaca"));
        Assertions.assertEquals("ay", removeDuplicates.removeDuplicates("azxxzy"));
    }
}