package trees;

/*
https://www.geeksforgeeks.org/depth-n-ary-tree/
Given an n-ary tree containing positive node values, the task is to find the depth of the tree.
Note: An n-ary tree is a tree where each node can have zero or more children nodes. Unlike a binary tree, which has at most two children per node (left and right), the n-ary tree allows for multiple branches or children for each node. */

import objects.Node;

public class DepthOfNArrayTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int maxDepth = 0;
        for (Node child : root.children) {
            maxDepth = Math.max(maxDepth, maxDepth(child));
        }
        return maxDepth + 1;
    }

}
