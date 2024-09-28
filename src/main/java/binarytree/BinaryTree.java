package binarytree;

import objects.TreeNode;

public class BinaryTree {

     final TreeNode root;

    public BinaryTree(int value) {
        root = new TreeNode(value);
    }

    public void addLeft(TreeNode parent, TreeNode child) {
        parent.left = child;
    }

    public void addRight(TreeNode parent, TreeNode child) {
        parent.right = child;
    }

    public void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}
