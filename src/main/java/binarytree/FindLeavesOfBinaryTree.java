package binarytree;

/*
Given the root of a binary tree, collect a tree's nodes as if you were doing this:

    Collect all the leaf nodes.
    Remove all the leaf nodes.
    Repeat until the tree is empty.



Example 1:

Input: root = [1,2,3,4,5]
Output: [[4,5,3],[2],[1]]
Explanation:
[[3,5,4],[2],[1]] and [[3,4,5],[2],[1]] are also considered correct answers since per each level it does not matter the order on which elements are returned.

Example 2:

Input: root = [1]
Output: [[1]]



Constraints:

    The number of nodes in the tree is in the range [1, 100].
    -100 <= Node.val <= 100

 */

import objects.TreeNode;

import java.util.List;

public class FindLeavesOfBinaryTree {

    public List<List<Integer>> findLeaves(TreeNode root) {
        TreeNode node = root;
        List<List<Integer>> result = new java.util.ArrayList<>();
        while (node != null) {
            List<Integer> leaves = new java.util.ArrayList<>();
            findLeaves(node, leaves);
            result.add(leaves);
            node = removeLeaves(node);
        }
        return result;
    }

    private void findLeaves(TreeNode node, List<Integer> leaves) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }
        findLeaves(node.left, leaves);
        findLeaves(node.right, leaves);
    }

    private TreeNode removeLeaves(TreeNode node) {
        if (node == null) {
            return null;
        }
        if (node.left == null && node.right == null) {
            return null;
        }
        node.left = removeLeaves(node.left);
        node.right = removeLeaves(node.right);
        return node;
    }
}
