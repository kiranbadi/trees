package binarytree;

import junit.framework.TestCase;
import objects.TreeNode;

public class BinaryTreeTest extends TestCase {

    private BinaryTree binaryTree;

    public void setUp() throws Exception {
        super.setUp();
        binaryTree = new BinaryTree(1);
    }

    public void tearDown()  {
        binaryTree = null;

    }

    public void testAddLeft() {
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        assertEquals(2, binaryTree.root.left.val);
    }

    public void testAddRight() {
        binaryTree.addRight(binaryTree.root, new TreeNode(3));
        assertEquals(3, binaryTree.root.right.val);
    }

    public void testPrintInOrder() {
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        binaryTree.addRight(binaryTree.root, new TreeNode(3));
        binaryTree.printInOrder(binaryTree.root);
    }

    public void testBuildBinaryTree() {
        binaryTree = new BinaryTree(1);
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        binaryTree.addRight(binaryTree.root, new TreeNode(3));
        binaryTree.addLeft(binaryTree.root.left, new TreeNode(4));
        binaryTree.addRight(binaryTree.root.left, new TreeNode(5));
        binaryTree.addLeft(binaryTree.root.right, new TreeNode(6));
        binaryTree.addRight(binaryTree.root.right, new TreeNode(7));
        binaryTree.printInOrder(binaryTree.root);
        assertEquals(4, binaryTree.root.left.left.val);
    }
}