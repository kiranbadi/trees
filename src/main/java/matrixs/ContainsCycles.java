package matrixs;

/*
Given a 2D array of characters grid of size m x n, you need to find if there exists any cycle consisting of the same value in grid.

A cycle is a path of length 4 or more in the grid that starts and ends at the same cell. From a given cell, you can move to one of the cells adjacent to it - in one of the four directions (up, down, left, or right), if it has the same value of the current cell.

Also, you cannot move to the cell that you visited in your last move. For example, the cycle (1, 1) -> (1, 2) -> (1, 1) is invalid because from (1, 2) we visited (1, 1) which was the last visited cell.

Return true if any cycle of the same value exists in grid, otherwise, return false.
 */
public class ContainsCycles {

    // read the problem statement and implement the solution here
    // add comments after every line of code to explain what it does
    public boolean containsCycle(char[][] grid) {
        int m = grid.length; // get the number of rows in the grid
        int n = grid[0].length; // get the number of columns in the grid
        boolean[][] visited = new boolean[m][n]; // create a 2D array to keep track of visited cells

        for (int i = 0; i < m; i++) { // iterate through each row
            for (int j = 0; j < n; j++) { // iterate through each column
                if (!visited[i][j]) { // if the cell has not been visited
                    if (dfs(grid, visited, i, j, -1, -1)) { // perform DFS to check for cycles
                        return true; // if a cycle is found, return true
                    }
                }
            }
        }
        return false; // if no cycles are found, return false
    }

    private boolean dfs(char[][] grid, boolean[][] visited, int i, int j, int pi, int pj) {
        int m = grid.length;
        int n = grid[0].length;
        // get index out of bounds or if the current cell is not the same as the previous cell
        // catch index out of bounds and return false if the current cell is not the same as the previous cell
        if (i < 0 || i >= m || j < 0 || j >= n ) {
            // this line gives index out of bounds grid[i][j] != grid[pi][pj]
            // fix this by checking if pi and pj are valid indices before accessing grid[pi][pj]
            return false;
        }
        if (visited[i][j]) {
            return true; // return true if the cell has been visited (cycle detected)
        }
        visited[i][j] = true; // mark the cell as visited
        int[] dirs = {-1, 0, 1, 0, -1}; // directions for moving up, right, down, left
        for (int d = 0; d < 4; d++) {
            int ni = i + dirs[d];
            int nj = j + dirs[d + 1];
            if (ni == pi && nj == pj) {
                continue;
            }
            if (dfs(grid, visited, ni, nj, i, j)) {
                return true;
            }
        }
        return false;
    }
}
