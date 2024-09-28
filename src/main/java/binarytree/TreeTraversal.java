package binarytree;

import objects.TreeNode;

import java.util.Stack;

public class TreeTraversal {

    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public void iterativeInOrderTraversal(TreeNode root) {
        //use stack to store the nodes
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            //push the left nodes to the stack
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            //pop the node from the stack
            current = stack.pop();
            System.out.print(current.val + " ");
            //move to the right node
            current = current.right;
        }

    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.val) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public TreeNode search(TreeNode root, int value) {
        if (root == null || root.val == value) {
            return root;
        }
        if (value < root.val) {
            return search(root.left, value);
        }
        return search(root.right, value);
    }


    // delete a  leaf node
    public TreeNode deleteLeafNode(TreeNode root, int value) {
        if (root == null) return null;
        if (value < root.val) {
            root.left = deleteLeafNode(root.left, value);
        } else if (value > root.val) {
            root.right = deleteLeafNode(root.right, value);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
        }
        return root;
    }

    // delete a node with one child
    public TreeNode deleteNodeWithOneChild(TreeNode root, int value) {
        if (root == null) return null;
        if (value < root.val) {
            root.left = deleteNodeWithOneChild(root.left, value);
        } else if (value > root.val) {
            root.right = deleteNodeWithOneChild(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
        }
        return root;
    }

    // delete a node with two children
    public TreeNode deleteNodeWithTwoChildren(TreeNode root, int value) {
        if (root == null) return null;
        if (value < root.val) {
            root.left = deleteNodeWithTwoChildren(root.left, value);
        } else if (value > root.val) {
            root.right = deleteNodeWithTwoChildren(root.right, value);
        } else if (root.left != null && root.right != null) {
               TreeNode temp = minValue(root.right);
               root.val = temp.val;
                root.right = deleteNodeWithTwoChildren(root.right, temp.val);
        } else if (root.left == null) {
            return root.right;
        } else {
            return root.left;
        }
        return root;
    }

    public TreeNode minValue(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
