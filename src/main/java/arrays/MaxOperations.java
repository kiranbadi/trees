package arrays;

import java.util.Arrays;

/*
You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.



Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.

Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.



Constraints:

    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= k <= 109


 */
public class MaxOperations {

    public int maxOperations(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // Skip if nums[i] was already used in a previous pair
            if (nums[i] == -1) continue;

            for (int j = i + 1; j < nums.length; j++) {
                // Skip if nums[j] was already used
                if (nums[j] == -1) continue;

                if (nums[i] + nums[j] == k) {
                    count++;
                    nums[i] = -1;
                    nums[j] = -1;
                    break; // Stop inner loop since nums[i] is now consumed!
                }
            }
        }
        return count;
    }


    // use 2 pointers
    public int maxOperations2(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        // Step 2: Two-pointer traversal toward the middle
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                count++; // Valid pair found!
                left++;  // Move past the used left element
                right--; // Move past the used right element
            } else if (sum < k) {
                left++;  // Need a larger sum -> advance left pointer
            } else {
                right--; // Need a smaller sum -> advance right pointer
            }
        }

        return count;
    }
}
