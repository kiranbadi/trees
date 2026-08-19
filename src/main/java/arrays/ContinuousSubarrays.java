package arrays;

import java.util.TreeMap;

/*
You are given a 0-indexed integer array nums. A subarray of nums is called continuous if:

    Let i, i + 1, ..., j be the indices in the subarray. Then, for each pair of indices i <= i1, i2 <= j, 0 <= |nums[i1] - nums[i2]| <= 2.

Return the total number of continuous subarrays.

A subarray is a contiguous non-empty sequence of elements within an array.



Example 1:

Input: nums = [5,4,2,4]
Output: 8
Explanation:
Continuous subarray of size 1: [5], [4], [2], [4].
Continuous subarray of size 2: [5,4], [4,2], [2,4].
Continuous subarray of size 3: [4,2,4].
There are no subarrays of size 4.
Total continuous subarrays = 4 + 3 + 1 = 8.
It can be shown that there are no more continuous subarrays.



Example 2:

Input: nums = [1,2,3]
Output: 6
Explanation:
Continuous subarray of size 1: [1], [2], [3].
Continuous subarray of size 2: [1,2], [2,3].
Continuous subarray of size 3: [1,2,3].
Total continuous subarrays = 3 + 2 + 1 = 6.



Constraints:

    1 <= nums.length <= 105
    1 <= nums[i] <= 109

 */
public class ContinuousSubarrays {

    public long continuousSubarrays(int[] nums) {
        long count = 0;
        int left = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int right = 0; right < nums.length; right++) {
            // Add current element to the map
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Shrink window while the difference between max and min > 2
            while (map.lastKey() - map.firstKey() > 2) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            // All subarrays ending at right and starting from any index in [left, right] are valid
            count += right - left + 1;
        }

        return count;
    }
}
