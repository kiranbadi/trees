package binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import objects.TreeNode;

public class BinaryTreeTest {

    private BinaryTree binaryTree;


    @BeforeEach
    public void setUp() throws Exception {
        binaryTree = new BinaryTree(1);
    }

    @AfterEach
    public void tearDown()  {
        binaryTree = null;

    }
    @Test
    public void testAddLeft() {
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        Assertions.assertEquals(2, binaryTree.root.left.val);
    }

    @Test
    public void testAddRight() {
        binaryTree.addRight(binaryTree.root, new TreeNode(3));
        Assertions.assertEquals(3, binaryTree.root.right.val);
    }

    @Test
    public void testPrintInOrder() {
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        binaryTree.addRight(binaryTree.root, new TreeNode(3));
        binaryTree.printInOrder(binaryTree.root);
    }

    @Test
    public void testBuildBinaryTree() {
        binaryTree = new BinaryTree(1);
        binaryTree.addLeft(binaryTree.root, new TreeNode(2));
        binaryTree.addRight(binaryTree.root, new TreeNode(3));
        binaryTree.addLeft(binaryTree.root.left, new TreeNode(4));
        binaryTree.addRight(binaryTree.root.left, new TreeNode(5));
        binaryTree.addLeft(binaryTree.root.right, new TreeNode(6));
        binaryTree.addRight(binaryTree.root.right, new TreeNode(7));
        binaryTree.printInOrder(binaryTree.root);
        Assertions.assertEquals(4, binaryTree.root.left.left.val);
    }
}