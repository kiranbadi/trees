package binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import objects.TreeNode;

public class MaxDepthTest {

    private MaxDepth maxDepth;

    public void setUp() throws Exception {
        maxDepth = new MaxDepth();
    }

    public void tearDown() {
        maxDepth = null;
    }

    @Test
    public void testMaxDepth() {
        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        binaryTree.addRight(binaryTree.root, new TreeNode(3));
        binaryTree.addLeft(binaryTree.root.left, new TreeNode(4));
        binaryTree.addRight(binaryTree.root.left, new TreeNode(5));
        binaryTree.addLeft(binaryTree.root.right, new TreeNode(6));
        binaryTree.addRight(binaryTree.root.right, new TreeNode(7));
        Assertions.assertEquals(3, maxDepth.maxDepth(binaryTree.root));
    }
}