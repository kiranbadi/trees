package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTraversalTest {

    private TreeTraversal treeTraversal;

    @BeforeEach
    void setUp() {
        treeTraversal = new TreeTraversal();
    }

    @AfterEach
    void tearDown() {
        treeTraversal = null;
    }

    @Test
    void inOrderTraversal() {
        TreeNode root = new TreeNode(1);
        treeTraversal.inOrderTraversal(root);

    }
    @Test
    void preOrderTraversal() {
        TreeNode root = new TreeNode(1);
        treeTraversal.preOrderTraversal(root);
    }

    @Test
    void postOrderTraversal() {
        TreeNode root = new TreeNode(1);
        treeTraversal.postOrderTraversal(root);
    }

    @Test
    void iterativeInOrderTraversal() {
        TreeNode root = new TreeNode(1);
        treeTraversal.iterativeInOrderTraversal(root);
    }

    @Test
    void insert() {
        TreeNode root = new TreeNode(1);
        treeTraversal.insert(root, 2);
        Assertions.assertEquals(2, root.right.val);
    }

    @Test
    void printInOrder() {
        TreeNode root = new TreeNode(1);
        treeTraversal.printInOrder(root);
        Assertions.assertEquals(1, root.val);
    }

    @Test
    void search() {
        TreeNode root = new TreeNode(1);
        treeTraversal.search(root, 1);
        Assertions.assertEquals(1, root.val);
    }

    @Test
    void deleteLeafNode() {
        TreeNode root = new TreeNode(1);
        treeTraversal.deleteLeafNode(root, 1);
        Assertions.assertEquals(1, root.val);
    }

    @Test
    void deleteNodeWithOneChild() {
        TreeNode root = new TreeNode(1);
        treeTraversal.deleteNodeWithOneChild(root, 1);
        Assertions.assertEquals(1, root.val);
    }

    @Test
    void deleteNodeWithTwoChildren() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        treeTraversal.deleteNodeWithTwoChildren(root, 1);
        Assertions.assertEquals(6, root.val);

    }
}