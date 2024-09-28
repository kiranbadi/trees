package binarytree;

/*
    * Given a binary tree, find the sum of all numbers formed by root to leaf paths.
 */

import objects.TreeNode;

public class SumNumbers {

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int currentSum) {
        if (root == null) {
            return 0;
        }
        currentSum = currentSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return currentSum;
        }
        return sumNumbers(root.left, currentSum) + sumNumbers(root.right, currentSum);
    }
}