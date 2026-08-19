package arrays;

import java.util.Comparator;
import java.util.List;

/*
You are given an array processorTime representing the time each processor becomes available and an array tasks representing how long each task takes to complete. Return the minimum time needed to complete all tasks.



Example 1:

Input: processorTime = [8,10], tasks = [2,2,3,1,8,7,4,5]

Output: 16

Explanation:

Assign the tasks at indices 4, 5, 6, 7 to the first processor which becomes available at time = 8, and the tasks at indices 0, 1, 2, 3 to the second processor which becomes available at time = 10.

The time taken by the first processor to finish the execution of all tasks is max(8 + 8, 8 + 7, 8 + 4, 8 + 5) = 16.

The time taken by the second processor to finish the execution of all tasks is max(10 + 2, 10 + 2, 10 + 3, 10 + 1) = 13.

Example 2:

Input: processorTime = [10,20], tasks = [2,3,1,2,5,8,4,3]

Output: 23

Explanation:

Assign the tasks at indices 1, 4, 5, 6 to the first processor and the others to the second processor.

The time taken by the first processor to finish the execution of all tasks is max(10 + 3, 10 + 5, 10 + 8, 10 + 4) = 18.

The time taken by the second processor to finish the execution of all tasks is max(20 + 2, 20 + 1, 20 + 2, 20 + 3) = 23.



Constraints:

    1 <= n == processorTime.length <= 25000
    1 <= tasks.length <= 105
    0 <= processorTime[i] <= 109
    1 <= tasks[i] <= 109
    tasks.length == 4 * n

 */
public class MinimumProcessingTime {

    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        // 1. Sort processorTime ascending (earliest available processors first)
        processorTime.sort(Comparator.comparingInt(a -> a));

        // 2. Sort tasks descending (longest tasks first)
        tasks.sort(Comparator.comparingInt(a -> -a));

        int maxTime = 0;
        int n = processorTime.size();

        // 3. Assign exactly 4 tasks to each processor
        for (int i = 0; i < n; i++) {
            // Since tasks are sorted descending, the longest task for processor 'i'
            // is always at index 'i * 4'.
            int completionTime = processorTime.get(i) + tasks.get(i * 4);
            maxTime = Math.max(maxTime, completionTime);
        }

        return maxTime;
    }
}
