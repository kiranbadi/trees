package maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStarsTest {

    private RemoveStars removeStars;

    @BeforeEach
    void setUp() {
        removeStars = new RemoveStars();
    }

    @AfterEach
    void tearDown() {
        removeStars = null;
    }

    @Test
    void removeStars() {
        String str = "rtest**ABC";
        String expected = "rteABC";
        String actual = removeStars.removeStars(str);
        Assertions.assertEquals(expected, actual);
    }
}