package arrays;

/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, it becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

Constraints:

    1 <= s.length <= 3 * 105
    s consists of printable ASCII characters.


 */

public class ReverseVowels {

    public String reverseVowels(String s) {
        // Step 1: Guard clause for null or empty string inputs
        if (s == null || s.isEmpty()) {
            return s;
        }

        // Step 2: Convert String to char array because Java Strings are immutable
        char[] chars = s.toCharArray();

        // Step 3: Initialize two pointers
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Move left pointer forward until it finds a vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            // Move right pointer backward until it finds a vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Step 4: Swap the vowels found at 'left' and 'right'
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Advance pointers to avoid swapping the same characters again
                left++;
                right--;
            }
        }

        // Step 5: Convert character array back into a String
        return new String(chars);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
