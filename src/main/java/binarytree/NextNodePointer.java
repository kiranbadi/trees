package binarytree;


import objects.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*

 populate next node pointer for each node in a binary tree.
 note here Binary tree is not a BST, so we can't use the property of BST to solve this problem.
 we can use level order traversal to solve this problem.

 */
public class NextNodePointer {

    public TreeNode connect(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode prev = null;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (prev != null) {
                    prev.next = node;
                }
                prev = node;

                assert node != null;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            prev.next = null;
        }

        return root;

    }
}
