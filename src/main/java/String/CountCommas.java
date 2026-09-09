package String;

/*
You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:

    A comma is inserted after every three digits from the right.
    Numbers with fewer than 4 digits contain no commas.



Example 1:

Input: n = 1002

Output: 3

Explanation:

The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3.

Example 2:

Input: n = 998

Output: 0

Explanation:

All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.



Constraints:

    1 <= n <= 1015

 */

public class CountCommas {
    // fail for use case 1004590  expected 1008182 but got 1003591 fix this
    public long countCommas(long n) {
        long total = 0;
        long groupStart = 1_000L;
        int commasPerNumber = 1;
        while (groupStart <= n) {
            long groupEnd = Math.min(n, groupStart * 1_000L - 1);
            total += (groupEnd - groupStart + 1) * commasPerNumber;
            groupStart *= 1_000L;
            commasPerNumber++;
        }
        return total;
    }

    public int countIntCommas(long n) {
        int total = 0;
        int groupStart = Math.toIntExact(1_000L);
        int commasPerNumber = 1;
        while (groupStart <= n) {
            long groupEnd = Math.min(n, groupStart * 1_000L - 1);
            total += (int) ((groupEnd - groupStart + 1) * commasPerNumber);
            groupStart *= 1_000;
            commasPerNumber++;
        }
        return total;
    }
}
