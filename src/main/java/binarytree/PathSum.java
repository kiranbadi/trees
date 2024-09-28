package binarytree;
/*
    * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 */


import objects.TreeNode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return hasPathSum(root, sum, 0);
    }

    private boolean hasPathSum(TreeNode root, int sum, int currentSum) {
        if (root == null) {
            return false;
        }
        currentSum += root.val;
        if (root.left == null && root.right == null) {
            return currentSum == sum;
        }
        return hasPathSum(root.left, sum, currentSum) || hasPathSum(root.right, sum, currentSum);
    }
}
