package arrays;

/*
ou are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:

Input: height = [1,1]
Output: 1



Constraints:

    n == height.length
    2 <= n <= 105
    0 <= height[i] <= 104

 */
public class MaxArea {

    public int maxArea(int[] height) {
        // Step 1: Edge case check for null or empty input
        if (height == null || height.length == 0) {
            return 0;
        }

        int max = 0; // Tracks the maximum area found so far

        // Step 2: Outer loop chooses the LEFT wall (line i)
        for (int i = 0; i < height.length - 1; i++) {

            // Step 3: Inner loop chooses every possible RIGHT wall (line j)
            for (int j = i + 1; j < height.length; j++) {

                // Calculate area between wall i and wall j
                int area = (j - i) * Math.min(height[i], height[j]);

                // Update maximum if current container holds more water
                if (area > max) {
                    max = area;
                }
            }
        }

        return max;
    }


    public int maxArea1(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int area = width * currentHeight;

            max = Math.max(max, area);

            // Move the shorter wall inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
