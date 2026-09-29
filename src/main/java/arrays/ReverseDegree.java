package arrays;

/*

Given a string s, calculate its reverse degree.

The reverse degree is calculated as follows:

    For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
    Sum these products for all characters in the string.

Return the reverse degree of s.
 */

public class ReverseDegree {

    public int reverseDegree(String s) {
        int degree = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int positionInReversedAlphabet = 26 - (c - 'a');
            int positionInString = i + 1;
            degree += positionInReversedAlphabet * positionInString;
        }
        return degree;

    }
}
