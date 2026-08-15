package binarytree;



/*
Given a grid-based maze, each cell is either empty (0) or contains an obstacle (1).
A player starts at the top-left cell (0, 0) and must reach the bottom-right cell (n - 1, m - 1).
The player has a jump parameter k. In a single move, the player may jump between 1 and k cells in one of the four cardinal directions:
Right: (i, j) → (i, j + x) where 1 ≤ x ≤ k
Down: (i, j) → (i + x, j) where 1 ≤ x ≤ k
Left: (i, j) → (i, j - x) where 1 ≤ x ≤ k
Up: (i, j) → (i - x, j) where 1 ≤ x ≤ k
For any move, every cell along the jump path (including the destination cell) must:
be inside the maze boundaries, and
be free of obstacles (0).
Determine the minimum number of moves required to reach the destination. If it is impossible, return -1.
 */


import java.util.ArrayDeque;
import java.util.Queue;

/*
Given a grid-based maze, each cell is either empty (0) or contains an obstacle (1).
A player starts at (0, 0) and must reach (n - 1, m - 1).

The player may jump between 1 and k cells in:
Right, Down, Left, Up.

Every cell crossed during the jump must be free of obstacles.

Return the minimum number of moves required.
Return -1 if the destination cannot be reached.
*/
public class MinimumMoves {

    public int jumpCells(int[][] maze, int k) {

        int rows = maze.length;
        int cols = maze[0].length;

        // If start or destination is blocked
        if (maze[0][0] == 1 || maze[rows - 1][cols - 1] == 1) {
            return -1;
        }

        // If start is already destination
        if (rows == 1 && cols == 1) {
            return 0;
        }

        boolean[][] visited = new boolean[rows][cols];

        Queue<int[]> queue = new ArrayDeque<>();

        // {row, column, moves}
        queue.offer(new int[]{0, 0, 0});
        visited[0][0] = true;

        int[][] directions = {
                {0, 1},   // right
                {1, 0},   // down
                {0, -1},  // left
                {-1, 0}   // up
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];
            int moves = current[2];

            // Try all four directions
            for (int[] direction : directions) {

                // Try jumping 1 through k cells
                for (int jump = 1; jump <= k; jump++) {

                    int newRow = row + direction[0] * jump;
                    int newCol = col + direction[1] * jump;

                    // Outside the maze
                    if (newRow < 0 || newRow >= rows ||
                            newCol < 0 || newCol >= cols) {
                        break;
                    }

                    // Obstacle blocks the entire direction
                    if (maze[newRow][newCol] == 1) {
                        break;
                    }

                    // Destination reached
                    if (newRow == rows - 1 && newCol == cols - 1) {
                        return moves + 1;
                    }

                    if (!visited[newRow][newCol]) {
                        visited[newRow][newCol] = true;

                        queue.offer(new int[]{
                                newRow,
                                newCol,
                                moves + 1
                        });
                    }
                }
            }
        }

        return -1;
    }
}
