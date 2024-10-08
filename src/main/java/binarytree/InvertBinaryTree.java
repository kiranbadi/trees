package binarytree;

/*
    * Invert a binary tree.
    *
    * Example:
    *
    * Input:
    *
    *      4
    *    /   \
    *   2     7
    *  / \   / \
    * 1   3 6   9
    *
    * Output:
    *
    *      4
    *    /   \
    *   7     2
    *  / \   / \
    * 9   6 3   1
    *
 */

import objects.TreeNode;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = left;
        return root;
    }

}
