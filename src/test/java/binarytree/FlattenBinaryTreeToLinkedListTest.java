package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenBinaryTreeToLinkedListTest {

    private FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList;

    @BeforeEach
    void setUp() {
        flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();
    }

    @AfterEach
    void tearDown() {
        flattenBinaryTreeToLinkedList = null;
    }

    @Test
    void flatten() {
        BinaryTree binaryTree = new BinaryTree(1);
        TreeNode root = binaryTree.root;
        TreeNode node2 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        binaryTree.addLeft(root, node2);
        binaryTree.addRight(root, node5);
        binaryTree.addLeft(node2, node3);
        binaryTree.addRight(node2, node4);
        binaryTree.addRight(node5, node6);
        flattenBinaryTreeToLinkedList.flatten(root);
        assertEquals(1, root.val);
        assertNull(root.left);
    }
}