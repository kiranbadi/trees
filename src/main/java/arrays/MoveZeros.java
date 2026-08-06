package arrays;

/**
 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 Note that you must do this in-place without making a copy of the array.



 Example 1:

 Input: nums = [0,1,0,3,12]
 Output: [1,3,12,0,0]

 Example 2:

 Input: nums = [0]
 Output: [0]



 Constraints:

 1 <= nums.length <= 104
 -231 <= nums[i] <= 231 - 1


 Follow up: Could you minimize the total number of operations done?
 */

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; // Tracks where the next non-zero should go
        // Step 1: Shift all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i]; // Place non-zero and advance pointer
            }
        }
        // Step 2: Fill the rest of the array with zeroes
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
