package arrays;

/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.



Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.



Constraints:

    1 <= nums.length <= 105
    nums[i] is either 0 or 1.
    0 <= k <= nums.length

 */
public class LongestOnes {

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int zeroCount = 0; // Tracks the number of 0s in the current window

        while (right < nums.length) {
            // Step 1: Include the rightmost element in our window
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Step 2: If we have MORE than k zeros, shrink from the left
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--; // Leaving a 0 behind reduces our count
                }
                left++; // Move left pointer inward
            }

            // Step 3: Calculate valid window size and update max
            maxLength = Math.max(maxLength, right - left + 1);

            // Expand a window to the right for the next iteration
            right++;
        }

        return maxLength;
    }
}
