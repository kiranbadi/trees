package heaps;

/*
You are given an integer array cost where cost[i] is the cost of an ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.



Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.

Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.



Constraints:

    2 <= cost.length <= 1000
    0 <= cost[i] <= 999


 */

public class ClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n <= 1) return 0;

        // dp[i] represents the minimum cost to reach step i
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        // For each step, we can come from either the previous step or two steps back
        // Take the minimum cost path and add the current step's cost
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        // The answer is the minimum cost to reach either the last or second-to-last step
        // (since we can skip the last step by reaching the one before it)
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
