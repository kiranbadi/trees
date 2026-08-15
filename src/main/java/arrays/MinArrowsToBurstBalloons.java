package arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
here are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.

Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons.



Example 1:

Input: points = [[10,16],[2,8],[1,6],[7,12]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].

Example 2:

Input: points = [[1,2],[3,4],[5,6],[7,8]]
Output: 4
Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.

Example 3:

Input: points = [[1,2],[2,3],[3,4],[4,5]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
- Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].



Constraints:

    1 <= points.length <= 105
    points[i].length == 2
    -231 <= xstart < xend <= 231 - 1

 */
public class MinArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        // Sort the points by their end coordinates
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int arrows = 1; // At least one arrow is needed
        int end = points[0][1]; // The end of the first balloon
        for (int i = 1; i < points.length; i++) {
            // If the start of the current balloon is greater than the end of the last balloon,
            // we need a new arrow
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1]; // Update the end to the current balloon's end
            }
        }

        return arrows;
    }
}
