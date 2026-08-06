package arrays;


/*
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]

Example 2:

Input: nums = [1], k = 1

Output: [1]

Example 3:

Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

Output: [1,2]



Constraints:

    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    k is in the range [1, the number of unique elements in the array].
    It is guaranteed that the answer is unique.



Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // Initialize a HashMap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Initialize a priority queue to store the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        // This for loop iterates through each entry in the frequency map (which contains the numbers and their corresponding frequencies). For each entry, it adds the entry to the priority queue.
        // If the size of the priority queue exceeds k, it removes the entry with the lowest frequency (the root of the min-heap). This ensures that at the end of the loop, the priority queue contains only the k most frequent elements.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // Extract the keys from the priority queue into the result array
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = Objects.requireNonNull(pq.poll()).getKey();
        }
        return result;
    }
}
