package binarytree;


import objects.TreeNode;

/*
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
 */
public class LeafSimilarTree {

    /**
     * Determines if two binary trees have the same sequence of leaf values.
     *
     * @param root1 The root node of the first binary tree.
     * @param root2 The root node of the second binary tree.
     * @return true if both trees have matching leaf value sequences, false otherwise.
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // Perform DFS traversal on both trees to extract leaf sequences
        dfs(root1, sb1);
        dfs(root2, sb2);

        // Compare string representations directly without redundant toString() allocations
        return sb1.toString().contentEquals(sb2);
    }

    /**
     * Traverses the tree in pre-order / left-to-right DFS to find all leaf nodes.
     * Appends each leaf value followed by a delimiter (',') to the StringBuilder.
     *
     * @param node The current TreeNode being processed.
     * @param sb   The StringBuilder collecting leaf values.
     */
    private void dfs(TreeNode node, StringBuilder sb) {
        // Base case: empty subtree
        if (node == null) {
            return;
        }

        // Leaf node check - a node is a leaf if it has no left and right children
        if (node.left == null && node.right == null) {
            // Append value with comma delimiter to avoid multi-digit ambiguity
            // (e.g., distinguishing [1, 23] from [12, 3])
            sb.append(node.val).append(",");
        }

        // Continue the left-to-right depth-first traversal
        dfs(node.left, sb);
        dfs(node.right, sb);
    }
}
