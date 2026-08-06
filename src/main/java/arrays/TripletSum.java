package arrays;

/*
Given an array of integers, return all triplets [a, b, c] such that a + b + c = 0. The
solution must not contain duplicate triplets (e.g.. [1, 2, 3] and [2, 3, 1] are considered
duplicate triplets). If no such triplets are found, return an empty array.
Each triplet can be arranged in any order, and the output can be returned in any order.
Example:
Input nums = [0, -1, 2, -3, 1]
, Output: [[-3, 1, 2], [-1, 0, 1]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;

        // 1. Sort the array
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Early break: if the smallest number > 0, a sum cannot be 0
            if (nums[i] > 0) break;

            // Skip duplicate values for the fixed first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            // 2. Two-pointer search
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }

        return result;
    }
}
