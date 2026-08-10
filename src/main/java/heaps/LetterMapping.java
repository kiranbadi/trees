package heaps;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:

Input: digits = "2"
Output: ["a","b","c"]



Constraints:

    1 <= digits.length <= 4
    digits[i] is a digit in the range ['2', '9'].


 */

import java.util.ArrayList;
import java.util.List;

public class LetterMapping {

    // Index 0 and 1 are intentionally empty because digits '0' and '1'
    // do not map to letters on the phone keypad for this problem.
    private static final String[] PHONE_MAPPING = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        // Use backtracking to build every possible letter combination.
        // Example: for "23", try each letter from "abc" with each letter from "def".
        buildCombinations(digits, 0, new StringBuilder(), result);
        return result;

    }

    private void buildCombinations(String digits, int index, StringBuilder current, List<String> result) {
        // Base case: once we have chosen one letter for every digit,
        // the current string is one complete answer.
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = PHONE_MAPPING[digits.charAt(index) - '0'];

        // Try each possible letter for the current digit,
        // then move to the next digit.
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            buildCombinations(digits, index + 1, current, result);

            // Backtrack: remove the last chosen letter so we can try the next one.
            current.deleteCharAt(current.length() - 1);
        }
    }
}
