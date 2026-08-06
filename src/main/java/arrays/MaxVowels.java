package arrays;

/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.



Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.



Constraints:

    1 <= s.length <= 105
    s consists of lowercase English letters.
    1 <= k <= s.length

 */

public class MaxVowels {

    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxVowels = 0;
        int currentVowels = 0;

        // Process characters one by one
        for (int i = 0; i < n; i++) {
            // Step 1: Add incoming character at index 'i'
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }

            // Step 2: Remove outgoing character at index 'i - k' once window exceeds size k
            if (i >= k) {
                if (isVowel(s.charAt(i - k))) {
                    currentVowels--;
                }
            }

            // Step 3: Record the maximum vowel count seen so far
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    // Helper function to check if a character is a lowercase vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
