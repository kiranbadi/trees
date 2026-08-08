package binarytree;

import objects.TreeNode;

public class ZigZagPath {

    private int max = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        zigPath(root.left, false, 1);
        zigPath(root.right, true, 1);

        return max;
    }

    private void zigPath(TreeNode node, boolean cameFromRight, int length) {
        if (node == null) {
            return;
        }

        max = Math.max(max, length);

        if (cameFromRight) {
            // Previous move was right,
            // so continue zigzag by moving left
            zigPath(node.left, false, length + 1);

            // Starting a new zigzag by moving right
            zigPath(node.right, true, 1);
        } else {
            // Previous move was left,
            // so continue zigzag by moving right
            zigPath(node.right, true, length + 1);

            // Starting a new zigzag by moving left
            zigPath(node.left, false, 1);
        }
    }
}