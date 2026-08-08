package binarytree;

/*
Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.

The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).
 */

import objects.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0L, 1);
        return dfs(root, 0L, (long) targetSum, prefixCounts);
    }

    private int dfs(TreeNode node, long runningSum, long targetSum, Map<Long, Integer> prefixCounts) {
        if (node == null) {
            return 0;
        }

        runningSum += node.val;
        int count = prefixCounts.getOrDefault(runningSum - targetSum, 0);

        prefixCounts.put(runningSum, prefixCounts.getOrDefault(runningSum, 0) + 1);
        count += dfs(node.left, runningSum, targetSum, prefixCounts);
        count += dfs(node.right, runningSum, targetSum, prefixCounts);
        prefixCounts.put(runningSum, prefixCounts.get(runningSum) - 1);

        return count;
    }
}
