package graphs;

/*
You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+'). You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol] denotes the row and column of the cell you are initially standing at.

In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance. An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.

Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.
 */

import java.util.LinkedList;
import java.util.Queue;

public class MazeNearestExit {

    public int nearestExit(char[][] maze, int[] entrance) {

        int rows = maze.length;
        int cols = maze[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});

        // mark entrance as visited
        maze[entrance[0]][entrance[1]] = '+';

        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];
            int steps = current[2];

            for (int[] direction : directions) {

                int newRow = row + direction[0];
                int newCol = col + direction[1];

                // outside maze
                if (newRow < 0 || newRow >= rows ||
                        newCol < 0 || newCol >= cols) {
                    continue;
                }

                // wall or already visited
                if (maze[newRow][newCol] == '+') {
                    continue;
                }

                // check if this is an exit
                if (newRow == 0 || newRow == rows - 1 ||
                        newCol == 0 || newCol == cols - 1) {
                    return steps + 1;
                }

                // mark visited
                maze[newRow][newCol] = '+';

                queue.offer(new int[]{
                        newRow,
                        newCol,
                        steps + 1
                });
            }
        }

        return -1;
    }
}
