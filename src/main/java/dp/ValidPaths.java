package dp;

/*
A parentheses string is a non-empty string consisting only of '(' and ')'. It is valid if any of the following conditions is true:

    It is ().
    It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
    It can be written as (A), where A is a valid parentheses string.

You are given an m x n matrix of parentheses grid. A valid parentheses string path in the grid is a path satisfying all of the following conditions:

    The path starts from the upper left cell (0, 0).
    The path ends at the bottom-right cell (m - 1, n - 1).
    The path only ever moves down or right.
    The resulting parentheses string formed by the path is valid.

Return true if there exists a valid parentheses string path in the grid. Otherwise, return false.

eg. Input: grid = [["(","(","("],[")","(",")"],["(","(",")"],["(","(",")"]]
Output: true
Explanation: The above diagram shows two possible paths that form valid parentheses strings.
The first path shown results in the valid parentheses string "()(())".
The second path shown results in the valid parentheses string "((()))".
Note that there may be other valid parentheses string paths.


Input: grid = [[")",")"],["(","("]]
Output: false
Explanation: The two possible paths form the parentheses strings "))(" and ")((". Since neither of them are valid parentheses strings, we return false.

Constraints:

    m == grid.length
    n == grid[i].length
    1 <= m, n <= 100
    grid[i][j] is either '(' or ')'.


 */

public class ValidPaths {

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // If the number of rows and columns is odd, return false
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        // Create a 3D boolean array to keep track of visited states
        boolean[][][] visited = new boolean[m][n][m + n];

        // Start DFS from the top-left cell with an initial balance of 0
        return dfs(grid, visited, 0, 0, 0);
    }

    private boolean dfs(char[][] grid,
                        boolean[][][] visited,
                        int row,
                        int col,
                        int balance) {

        int m = grid.length;
        int n = grid[0].length;

        // Process the current cell
        if (grid[row][col] == '(') {
            balance++;
        } else {
            balance--;
        }

        // Invalid: too many closing parentheses
        if (balance < 0) {
            return false;
        }

        // Remaining moves/cells after current position
        int remaining = (m - 1 - row) + (n - 1 - col);

        // Not enough remaining ')' to close open '('
        if (balance > remaining) {
            return false;
        }

        // Reached bottom-right
        if (row == m - 1 && col == n - 1) {
            return balance == 0;
        }

        // Already checked this state
        if (visited[row][col][balance]) {
            return false;
        }

        visited[row][col][balance] = true;

        // Move down
        if (row + 1 < m) {
            if (dfs(grid, visited, row + 1, col, balance)) {
                return true;
            }
        }

        // Move right
        if (col + 1 < n) {
            return dfs(grid, visited, row, col + 1, balance);
        }

        return false;
    }
}
