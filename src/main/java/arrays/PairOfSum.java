package arrays;


/*
Given an array of integers sorted in ascending order and a target value, return the indexes
of any pair of numbers in the array that sum to the target. The order of the indexes in the
result doesn’t matter. If no pair is found, return an empty array.
i Example 1:
i Input nums = (-5, -2, 3, 4, 6], target = 7
Output: [2, 3]
Explanation: nums[2] + nums[3] = 3 + 4 = 7
Example 2:
Input nums - [1, 1, 1], target = 2
Output: [0, 1]
Explanation: other valid outputs could be [1, 0], [6, 2], [2^ 0], [1, 2] or
[2, 1].
 */

public class PairOfSum {

    public int[] twoSum(int[] nums, int target) {
        // use 2 pointer
        int right = nums.length - 1;
        int left = 0;
        while (nums[left] < nums[right]) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}