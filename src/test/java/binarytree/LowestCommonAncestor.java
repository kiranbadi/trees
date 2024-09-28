package binarytree;

/*
    * Find the lowest common ancestor of two nodes in a binary tree.
 */


import objects.TreeNode;

public class LowestCommonAncestor {

    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }

        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}
