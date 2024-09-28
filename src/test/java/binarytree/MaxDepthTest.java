package binarytree;

import junit.framework.TestCase;
import objects.TreeNode;

public class MaxDepthTest extends TestCase {

    private MaxDepth maxDepth;

    public void setUp() throws Exception {
        super.setUp();
        maxDepth = new MaxDepth();
    }

    public void tearDown() {
        maxDepth = null;
    }

    public void testMaxDepth() {
        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        binaryTree.addRight(binaryTree.root, new TreeNode(3));
        binaryTree.addLeft(binaryTree.root.left, new TreeNode(4));
        binaryTree.addRight(binaryTree.root.left, new TreeNode(5));
        binaryTree.addLeft(binaryTree.root.right, new TreeNode(6));
        binaryTree.addRight(binaryTree.root.right, new TreeNode(7));
        assertEquals(3, maxDepth.maxDepth(binaryTree.root));
    }
}