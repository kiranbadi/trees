package String;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardRowTest {

    private KeyboardRow keyboardRow;

    @BeforeEach
    void setUp() {
        keyboardRow = new KeyboardRow();
    }

    @AfterEach
    void tearDown() {
        keyboardRow = null;
    }

    @Test
    void findWords() {
        Assertions.assertEquals(new String[]{}, keyboardRow.findWords(new String[]{"omk"}));
        Assertions.assertEquals(new String[]{"adsdf", "sfd"}, keyboardRow.findWords(new String[]{"adsdf", "sfd"}));
    }
}