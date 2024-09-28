package binarytree;


import objects.TreeNode;

import java.util.HashMap;

/*
    construct a binary tree from inorder and postorder traversal.
 */
public class BinaryTreeWithInOrderAndPostOrder {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildSubtree(0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    private TreeNode buildSubtree(int inStart, int inEnd, int[] postorder, int postStart, int postEnd, HashMap<Integer, Integer> map) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        // Root is always the last element in postorder array
        TreeNode root = new TreeNode(postorder[postEnd]);

        // Find the index of the root in the inorder array
        int inRootIndex = map.get(root.val);
        int leftTreeSize = inRootIndex - inStart;

        // Recursively build the left subtree
        root.left = buildSubtree(inStart, inRootIndex - 1, postorder, postStart, postStart + leftTreeSize - 1, map);

        // Recursively build the right subtree
        root.right = buildSubtree(inRootIndex + 1, inEnd, postorder, postStart + leftTreeSize, postEnd - 1, map);

        return root;
    }


}
