package binarytree;

/*
    * Count the number of nodes in a binary tree.
 */


import objects.TreeNode;

public class CountTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

}
