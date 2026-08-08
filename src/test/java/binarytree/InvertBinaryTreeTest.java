package binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import objects.TreeNode;

public class InvertBinaryTreeTest {

    private InvertBinaryTree invertBinaryTree;

    @BeforeEach
    public void setUp() throws Exception {
        invertBinaryTree = new InvertBinaryTree();
    }

    @AfterEach
    public void tearDown() {
        invertBinaryTree = null;
    }

    @Test
    public void testInvertTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode invertedRoot = invertBinaryTree.invertTree(root);

        Assertions.assertEquals(4, invertedRoot.val);
        Assertions.assertEquals(7, invertedRoot.left.val);
        Assertions.assertEquals(2, invertedRoot.right.val);
        Assertions.assertEquals(9, invertedRoot.left.left.val);
        Assertions.assertEquals(6, invertedRoot.left.right.val);
        Assertions.assertEquals(3, invertedRoot.right.left.val);
        Assertions.assertEquals(1, invertedRoot.right.right.val);
    }
}