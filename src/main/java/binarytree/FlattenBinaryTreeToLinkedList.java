package binarytree;
/*
  given the root of a binary tree, flatten the tree into a "linked list":

 */


import objects.TreeNode;

public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode temp = curr.right;
                TreeNode runner = curr.left;
                curr.left = null;
                curr.right = runner;
                while (runner.right != null) {
                    runner = runner.right;
                }
                runner.right = temp;
            }
            curr = curr.right;
        }
    }
}
