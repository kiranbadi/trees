package arrays;

/*
You have a long flowerbed in which some plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.



Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false


Constraints:

    1 <= flowerbed.length <= 2 * 104
    flowerbed[i] is 0 or 1.
    There are no two adjacent flowers in the flowerbed.
    0 <= n <= flowerbed.length

 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Tracks how many flowers we successfully plant

        for (int i = 0; i < flowerbed.length; i++) {
            // Step 1: Check if the current plot is empty
            if (flowerbed[i] == 0) {

                // Step 2: Check left neighbor
                // True if we're at the very start (i == 0) OR the left plot is empty
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);

                // Step 3: Check right neighbor
                // True if we're at the very end (i == last index) OR the right plot is empty
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // Step 4: If both sides are clear, plant a flower
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Mark the plot as planted so future iterations know
                    count++;          // Increment planted flower count
                }
            }
        }

        // Step 5: Can we plant at least 'n' flowers?
        return count >= n;
    }
}
