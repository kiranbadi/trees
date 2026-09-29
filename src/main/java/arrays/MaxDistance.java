package arrays;

import java.util.Arrays;

// FIXME: this code needs a fix and its not passing the lc tests.

/**
 * You are given an integer side, representing the edge length of a square with corners at (0, 0), (0, side), (side, 0), and (side, side) on a Cartesian plane.
 * <p>
 * You are also given a positive integer k and a 2D integer array points, where points[i] = [xi, yi] represents the coordinate of a point lying on the boundary of the square.
 * <p>
 * You need to select k elements among points such that the minimum Manhattan distance between any two points is maximized.
 * <p>
 * Return the maximum possible minimum Manhattan distance between the selected k points.
 * <p>
 * The Manhattan Distance between two cells (xi, yi) and (xj, yj) is |xi - xj| + |yi - yj|.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: side = 2, points = [[0,2],[2,0],[2,2],[0,0]], k = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * Select all four points.
 * <p>
 * Example 2:
 * <p>
 * Input: side = 2, points = [[0,0],[1,2],[2,0],[2,2],[2,1]], k = 4
 * <p>
 * Output: 1
 * <p>
 * Explanation:
 * <p>
 * Select the points (0, 0), (2, 0), (2, 2), and (2, 1).
 * <p>
 * Example 3:
 *  <p>
 * Input: side = 2, points = [[0,0],[0,1],[0,2],[1,2],[2,0],[2,2],[2,1]], k = 5
 *<p>
 * Output: 1
 *<p>
 * Explanation:
 *<p>
 * Select the points (0, 0), (0, 1), (0, 2), (1, 2), and (2, 2).
 * <p>
 *
 *
 * Constraints:
 *<p>
 *     1 <= side <= 109
 *     4 <= points.length <= min(4 * side, 15 * 103)
 *     points[i] == [xi, yi]
 *     The input is generated such that:
 *         points[i] lies on the boundary of the square.
 *         All points[i] are unique.
 *     4 <= k <= min(25, points.length)
 */

public class MaxDistance {

    public int maxDistance(int side, int[][] points, int k) {
        int n = points.length;
        int[] pos = new int[n];

        // Convert each boundary point into a position along the square perimeter.
        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];
            pos[i] = perimeterPosition(side, x, y);
        }

        Arrays.sort(pos);

        // Binary search the answer.
        int left = 0;
        int right = 2 * side;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canChoose(pos, side, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private int perimeterPosition(int side, int x, int y) {
        if (y == 0) {
            return x;
        } else if (x == side) {
            return side + y;
        } else if (y == side) {
            return 3 * side - x;
        } else {
            return 4 * side - y;
        }
    }

    private boolean canChoose(int[] pos, int side, int k, int minDist) {
        int n = pos.length;
        int[] extended = new int[2 * n];

        for (int i = 0; i < n; i++) {
            extended[i] = pos[i];
            extended[i + n] = pos[i] + 4 * side;
        }

        // Try each point as the starting point.
        for (int start = 0; start < n; start++) {
            int count = 1;
            int last = extended[start];

            for (int i = start + 1; i < start + n; i++) {
                if (extended[i] - last >= minDist) {
                    count++;
                    last = extended[i];
                    if (count >= k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
