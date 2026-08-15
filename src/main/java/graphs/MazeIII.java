package graphs;

import java.util.Arrays;
import java.util.PriorityQueue;
/*
There is a ball in a maze with empty spaces (represented as 0) and walls (represented as 1). The ball can go through the empty spaces by rolling up, down, left or right, but it won't stop rolling until hitting a wall. When the ball stops, it could choose the next direction (must be different from last chosen direction). There is also a hole in this maze. The ball will drop into the hole if it rolls onto the hole.

Given the m x n maze, the ball's position ball and the hole's position hole, where ball = [ballrow, ballcol] and hole = [holerow, holecol], return a string instructions of all the instructions that the ball should follow to drop in the hole with the shortest distance possible. If there are multiple valid instructions, return the lexicographically minimum one. If the ball can't drop in the hole, return "impossible".

If there is a way for the ball to drop in the hole, the answer instructions should contain the characters 'u' (i.e., up), 'd' (i.e., down), 'l' (i.e., left), and 'r' (i.e., right).

The distance is the number of empty spaces traveled by the ball from the start position (excluded) to the destination (included).

You may assume that the borders of the maze are all walls (see examples).


 */
public class MazeIII {

    /*
     * Approach:
     * - Use Dijkstra's algorithm because every roll can travel a different number of cells.
     * - For each stopping cell, track:
     *     1) the shortest distance found so far
     *     2) the lexicographically smallest path among all shortest paths
     * - The priority queue is ordered first by distance, then by path string.
     *   That guarantees the first time we remove the hole from the queue, we have the
     *   optimal answer.
     */

    private static final int[][] DIRECTIONS = {{1, 0}, {0, -1}, {0, 1}, {-1, 0}};
    private static final char[] MOVES = {'d', 'l', 'r', 'u'};

    private static class State {
        int row;
        int col;
        int distance;
        String path;

        State(int row, int col, int distance, String path) {
            this.row = row;
            this.col = col;
            this.distance = distance;
            this.path = path;
        }
    }

    public String findShortestWay(int[][] maze, int[] ball, int[] hole) {
        int rows = maze.length;
        int cols = maze[0].length;

        // dist[r][c] stores the minimum travel distance needed to reach cell (r, c).
        int[][] dist = new int[rows][cols];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // bestPath[r][c] stores the lexicographically smallest path for dist[r][c].
        String[][] bestPath = new String[rows][cols];

        PriorityQueue<State> pq = new PriorityQueue<>((a, b) -> {
            if (a.distance != b.distance) {
                return Integer.compare(a.distance, b.distance);
            }
            return a.path.compareTo(b.path);
        });

        dist[ball[0]][ball[1]] = 0;
        bestPath[ball[0]][ball[1]] = "";
        pq.offer(new State(ball[0], ball[1], 0, ""));

        while (!pq.isEmpty()) {
            State current = pq.poll();

            // Ignore stale queue entries if a better distance/path was already recorded.
            if (current.distance > dist[current.row][current.col]) {
                continue;
            }
            if (current.distance == dist[current.row][current.col]
                    && !current.path.equals(bestPath[current.row][current.col])) {
                continue;
            }

            // Because the queue is ordered by distance first and path second,
            // the first time we pop the hole we have the correct final answer.
            if (current.row == hole[0] && current.col == hole[1]) {
                return current.path;
            }

            for (int i = 0; i < DIRECTIONS.length; i++) {
                int[] direction = DIRECTIONS[i];
                int nextRow = current.row;
                int nextCol = current.col;
                int steps = 0;

                // Roll until hitting a wall or falling into the hole.
                while (isInside(nextRow + direction[0], nextCol + direction[1], rows, cols)
                        && maze[nextRow + direction[0]][nextCol + direction[1]] == 0) {
                    nextRow += direction[0];
                    nextCol += direction[1];
                    steps++;

                    // Stop immediately if the ball falls into the hole while rolling.
                    if (nextRow == hole[0] && nextCol == hole[1]) {
                        break;
                    }
                }

                // If the ball could not move in this direction, there is no new state to relax.
                if (steps == 0) {
                    continue;
                }

                int newDistance = current.distance + steps;
                String newPath = current.path + MOVES[i];

                // Relax the state when we found either:
                // 1) a shorter distance, or
                // 2) the same distance with a smaller lexicographical path.
                if (newDistance < dist[nextRow][nextCol]
                        || (newDistance == dist[nextRow][nextCol]
                        && (bestPath[nextRow][nextCol] == null
                        || newPath.compareTo(bestPath[nextRow][nextCol]) < 0))) {
                    dist[nextRow][nextCol] = newDistance;
                    bestPath[nextRow][nextCol] = newPath;
                    pq.offer(new State(nextRow, nextCol, newDistance, newPath));
                }
            }
        }

        // No path can reach the hole.
        return "impossible";
    }
    private boolean isInside(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

}
