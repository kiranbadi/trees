package String;

/*
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses .



Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".

Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".

Example 3:

Input: s = ""
Output: 0



Constraints:

    0 <= s.length <= 3 * 10^4
    s[i] is '(', or ')'.

 */

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxLen = 0;

        // Pass 1: left → right
        // Catches invalid cases where ')' exceeds '('
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                maxLen = Math.max(maxLen, 2 * left); // valid pair count × 2
            } else if (right > left) {
                left = right = 0; // broken by extra ')', reset
            }
        }

        left = right = 0;

        // Pass 2: right → left
        // Catches invalid cases where '(' exceeds ')'
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                maxLen = Math.max(maxLen, 2 * left);
            } else if (left > right) {
                left = right = 0; // broken by extra '(', reset
            }
        }

        return maxLen;
    }
}
