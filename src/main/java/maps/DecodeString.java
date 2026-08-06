package maps;

/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.



Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"

Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"

Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"



Constraints:

    1 <= s.length <= 30
    s consists of lowercase English letters, digits, and square brackets '[]'.
    s is guaranteed to be a valid input.
    All the integers in s are in the range [1, 300].


 */

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {

    public String decodeString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build multi-digit numbers like 100
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                // Save current state to stacks before entering new bracket scope
                countStack.push(k);
                stringStack.push(currentString);

                // Reset current state for the inner content
                currentString = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                // Retrieve state from previous scope
                StringBuilder decodedString = stringStack.pop();
                int count = countStack.pop();

                // Repeat inner content 'count' times and append to outer string
                decodedString.append(String.valueOf(currentString).repeat(Math.max(0, count)));
                currentString = decodedString;
            } else {
                // Append normal characters
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}
