package binarytree;

/*
Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.

Return the number of good nodes in the binary tree.
 */

import objects.TreeNode;

public class CountGoodNodes {


    /*
     Counts the number of good nodes in the binary tree.
     */
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, root.val);
    }

    /*
     Counts the number of good nodes in the binary tree.
     */
    private int dfs(TreeNode node, int maxVal) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.val >= maxVal) {
            count = 1;
        }
        maxVal = Math.max(maxVal, node.val);
        count += dfs(node.left, maxVal);
        count += dfs(node.right, maxVal);
        return count;
    }
}
