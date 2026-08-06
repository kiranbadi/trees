package arrays;

/*
 * You are given an m x n matrix board containing letters 'X' and 'O', capture regions that are surrounded:

    Connect: A cell is connected to adjacent cells horizontally or vertically.
    Region: To form a region connect every 'O' cell.
    Surround: A region is surrounded if none of the 'O' cells in that region are on the edge of the board. Such regions are completely enclosed by 'X' cells.

    To capture a surrounded region, replace all 'O's with 'X's in-place within the original board. You do not need to return anything.
    Example 1:

Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]

Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]

Explanation:

In the above diagram, the bottom region is not captured because it is on the edge of the board and cannot be surrounded.

Example 2:

Input: board = [["X"]]

Output: [["X"]]

Constraints:

    m == board.length
    n == board[i].length
    1 <= m, n <= 200
    board[i][j] is 'X' or 'O'.

 * */

public class SurroundedRegion {

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        // Mark the 'O's on the border and their connected 'O's
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || i == rows - 1 || j == 0 || j == cols - 1) && board[i][j] == 'O') {
                    dfs(board, i, j);
                }
            }
        }

        // Flip the remaining 'O's to 'X's and the marked 'O's back to 'O's
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    // This method performs a depth-first search (DFS) to mark all 'O's connected to the border.
    // It changes these 'O's to '#' to indicate they should not be flipped to 'X'.
    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = '#';
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}
