package binarytree;

/*
 construct a binary tree from inorder and preorder traversal.

 */

import objects.TreeNode;

import java.util.HashMap;

public class BuildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildSubtree(0, inorder.length - 1, preorder, 0, preorder.length - 1, map);
    }

    private TreeNode buildSubtree(int inStart, int inEnd, int[] preorder, int preStart, int preEnd, HashMap<Integer, Integer> map) {
        if (inStart > inEnd || preStart > preEnd) {
            return null;
        }

        // Root is always the first element in preorder array
        TreeNode root = new TreeNode(preorder[preStart]);

        // Find the index of the root in the inorder array
        int inRootIndex = map.get(root.val);
        int leftTreeSize = inRootIndex - inStart;

        // Recursively build the left subtree
        root.left = buildSubtree(inStart, inRootIndex - 1, preorder, preStart + 1, preStart + leftTreeSize, map);

        // Recursively build the right subtree
        root.right = buildSubtree(inRootIndex + 1, inEnd, preorder, preStart + leftTreeSize + 1, preEnd, map);

        return root;
    }
}
