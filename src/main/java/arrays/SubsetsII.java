package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sorting places duplicate values next to each other
        Arrays.sort(nums);

        backtrack(result, new ArrayList<>(), nums, 0);

        return result;
    }

    private void backtrack(
            List<List<Integer>> result,
            List<Integer> subset,
            int[] nums,
            int start) {

        // Add the current subset
        result.add(new ArrayList<>(subset));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate values at the same recursion level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose the current number
            subset.add(nums[i]);

            // Explore subsets containing this number
            backtrack(result, subset, nums, i + 1);

            // Remove the number before trying another option
            subset.removeLast();
        }
    }
}