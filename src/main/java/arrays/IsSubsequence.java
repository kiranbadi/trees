package arrays;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false



Constraints:

    0 <= s.length <= 100
    0 <= t.length <= 104
    s and t consist only of lowercase English letters.


Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?

 */

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        // Edge Case 1: s cannot be a subsequence if it's longer than t
        if (s.length() > t.length()) {
            return false;
        }

        // Edge Case 2: An empty string is always a valid subsequence
        if (s.isEmpty()) {
            return true;
        }

        int i = 0, j = 0; // i for s, j for t

        while (i < s.length() && j < t.length()) {
            // If characters match, advance pointer 'i' to find the next char in s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always advance pointer 'j' to inspect the next char in t
            j++;
        }

        // If 'i' reached s.length(), we matched every character in 's' in order
        return i == s.length();
    }
}
