package String;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    void setUp() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @AfterEach
    void tearDown() {
        longestSubstringWithoutRepeatingCharacters = null;
    }

    @Test
    void lengthOfLongestSubstring() {
        Assertions.assertNotNull(longestSubstringWithoutRepeatingCharacters);
        Assertions.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
        Assertions.assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" "));
        Assertions.assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"));
    }
}