package trees;

/*
https://www.geeksforgeeks.org/remove-all-leaf-nodes-from-a-generic-tree-or-n-ary-tree/
Given an n-ary tree containing positive node values, the task is to delete all the leaf nodes from the tree and print preorder traversal of the tree after performing the deletion.
Note: An n-ary tree is a tree where each node can have zero or more children nodes. Unlike a binary tree, which has at most two children per node (left and right), the n-ary tree allows for multiple branches or children for each node.


 */

import objects.Node;

public class DeleteAllLeafNodes {

    public Node deleteLeafNodes(Node root) {
        if (root == null) {
            return null;
        }

        if (root.children.isEmpty()) {
            return null;
        }

        for (int i = 0; i < root.children.size(); i++) {
            Node child = root.children.get(i);
            Node newChild = deleteLeafNodes(child);
            if (newChild == null) {
                root.children.remove(i);
                i--;
            }
        }

        return root;
    }
}
