package binarytree;

/*
    * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
    * Calling next() will return the next smallest number in the BST.
    * Note:
    * next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */


import objects.TreeNode;

import java.util.Stack;

public class BinarySearchTreeIterator {

    private final Stack<TreeNode> stack;

    public BinarySearchTreeIterator(TreeNode root) {
        stack = new Stack<>();
        pushAll(root);
    }

    private void pushAll(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }


}
