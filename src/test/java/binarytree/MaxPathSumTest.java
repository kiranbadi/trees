package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPathSumTest {

    private MaxPathSum maxPathSum;

    @BeforeEach
    void setUp() {
        maxPathSum = new MaxPathSum();
    }

    @AfterEach
    void tearDown() {
        maxPathSum = null;
    }

    @Test
    void maxPathSum() {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        binaryTree.addRight(binaryTree.root, new TreeNode(10));
        binaryTree.addLeft(binaryTree.root.left, new TreeNode(20));
        binaryTree.addRight(binaryTree.root.left, new TreeNode(1));
        binaryTree.addLeft(binaryTree.root.right, new TreeNode(-25));
        binaryTree.addRight(binaryTree.root.right, new TreeNode(3));
        assertEquals(45 ,maxPathSum.maxPathSum(binaryTree.root));

        binaryTree = new BinaryTree(10);
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        binaryTree.addRight(binaryTree.root, new TreeNode(10));
        binaryTree.addLeft(binaryTree.root.left, new TreeNode(20));
        binaryTree.addRight(binaryTree.root.left, new TreeNode(1));
        binaryTree.addLeft(binaryTree.root.right, new TreeNode(-25));
        binaryTree.addRight(binaryTree.root.right, new TreeNode(3));
        binaryTree.addLeft(binaryTree.root.left.left, new TreeNode(4));
        binaryTree.addRight(binaryTree.root.left.left, new TreeNode(5));
        binaryTree.addLeft(binaryTree.root.left.right, new TreeNode(6));
        binaryTree.addRight(binaryTree.root.left.right, new TreeNode(7));
        assertEquals(50, maxPathSum.maxPathSum(binaryTree.root));
    }
}