package graphs;

/*
There is a 1 million by 1 million grid on an XY-plane, and the coordinates of each grid square are (x, y).

We start at the source = [sx, sy] square and want to reach the target = [tx, ty] square. There is also an array of blocked squares, where each blocked[i] = [xi, yi] represents a blocked square with coordinates (xi, yi).

Each move, we can walk one square north, east, south, or west if the square is not in the array of blocked squares. We are also not allowed to walk outside of the grid.

Return true if and only if it is possible to reach the target square from the source square through a sequence of valid moves.
 Example 1:

Input: blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
Output: false
Explanation: The target square is inaccessible starting from the source square because we cannot move.
We cannot move north or east because those squares are blocked.
We cannot move south or west because we cannot go outside of the grid.

Example 2:

Input: blocked = [], source = [0,0], target = [999999,999999]
Output: true
Explanation: Because there are no blocked cells, it is possible to reach the target square.

Constraints:

    0 <= blocked.length <= 200
    blocked[i].length == 2
    0 <= xi, yi < 106
    source.length == target.length == 2
    0 <= sx, sy, tx, ty < 106
    a source != target
    It is guaranteed that source and target are not blocked.


 */

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class EscapeLargeMaze {

    private static final int GRID_BOUND = 1_000_000;

    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {

        // If there are no blocked cells, movement is unrestricted on the grid.
        if (blocked.length == 0) {
            return true;
        }

        Set<Long> blockedCells = new HashSet<>();
        for (int[] cell : blocked) {
            blockedCells.add(encode(cell[0], cell[1]));
        }

        // With n blocked cells, the largest enclosed area is n * (n - 1) / 2.
        // If BFS explores more than these many cells, we are guaranteed to have escaped
        // any possible enclosure made by blocked cells.
        int maxEnclosedArea = blocked.length * (blocked.length - 1) / 2;

        // We must verify escape from both ends:
        // 1) source is not trapped, and
        // 2) target is not trapped.
        // This avoids false positives when one side is enclosed.
        return canReachOrEscape(source, target, blockedCells, maxEnclosedArea)
                && canReachOrEscape(target, source, blockedCells, maxEnclosedArea);
    }

    private boolean canReachOrEscape(int[] start, int[] finish, Set<Long> blockedCells, int limit) {

        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        Queue<int[]> queue = new ArrayDeque<>();
        Set<Long> visited = new HashSet<>();

        queue.offer(new int[]{start[0], start[1]});
        visited.add(encode(start[0], start[1]));

        while (!queue.isEmpty() && visited.size() <= limit) {
            int[] current = queue.poll();

            for (int[] direction : directions) {
                int nextX = current[0] + direction[0];
                int nextY = current[1] + direction[1];

                // Skip positions outside the valid 0..999999 coordinate range.
                if (nextX < 0 || nextX >= GRID_BOUND || nextY < 0 || nextY >= GRID_BOUND) {
                    continue;
                }

                // If we can step onto the finish cell, a valid path exists.
                if (nextX == finish[0] && nextY == finish[1]) {
                    return true;
                }

                long key = encode(nextX, nextY);
                if (blockedCells.contains(key) || visited.contains(key)) {
                    continue;
                }

                visited.add(key);
                queue.offer(new int[]{nextX, nextY});
            }
        }

        // If we explored past the enclosure limit, we are not trapped.
        return visited.size() > limit;
    }

    private long encode(int x, int y) {
        // Use a collision-free mapping for the 1_000_000 x 1_000_000 grid.
        return (long) x * GRID_BOUND + y;
    }
}
