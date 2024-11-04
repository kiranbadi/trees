package trees;

/*
https://www.geeksforgeeks.org/preorder-traversal-of-n-ary-tree-without-recursion/#
    * PreOrderTraversal
    * Given an n-ary tree, print preorder traversal of it.
    The idea is to use stack like iterative preorder traversal of binary tree.
 */


import objects.Node;

import java.util.Stack;

public class PreOrderTraversal {

    public void printPreOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        // Create an empty stack and push root to it
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        // Pop all items one by one. Do following for every popped item
        // a) print it
        // b) push its children from right to left
        while (!stack.isEmpty()) {
            // Pop the top item from stack and print it
            Node curr = stack.pop();
            System.out.print(curr.data + " ");

            // Get children of the popped item from right to left
            for (int i = curr.children.size() - 1; i >= 0; i--) {
                stack.push(curr.children.get(i));
            }
        }

    }
}
