package maps;
/*
Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).



Example 1:

Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]

Example 2:

Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]



Constraints:

    n == grid.length == grid[i].length
    1 <= n <= 200
    1 <= grid[i][j] <= 105

 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualPairs {

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < n; j++) {
                boolean equal = true;
                for (int k = 0; k < n; k++) {
                    if (ints[k] != grid[k][j]) {
                        equal = false;
                        break;
                    }
                }
                if (equal) {
                    count++;
                }
            }
        }
        return count;
    }


    //Use a Hash Table to store row frequencies.
    // This reduces the search time for matching columns from linear to constant on average.

    public int equalPairs1(int[][] grid) {
        int n = grid.length;
        int count = 0;
        // Map to store the frequency of each row represented as a String
        Map<String, Integer> rowMap = new HashMap<>();

        // 1. Store the frequency of each row in the HashMap
        for (int[] row : grid) {
            String rowStr = Arrays.toString(row);
            rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
        }

        // 2. Build each column and check its frequency in the map
        for (int col = 0; col < n; col++) {
            int[] columnData = new int[n];
            for (int row = 0; row < n; row++) {
                columnData[row] = grid[row][col];
            }

            String colStr = Arrays.toString(columnData);
            // Add the count of matching rows for this column
            count += rowMap.getOrDefault(colStr, 0);
        }

        return count;
    }
}
