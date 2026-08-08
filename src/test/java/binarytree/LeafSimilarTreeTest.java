package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTreeTest {

    private LeafSimilarTree leafSimilarTree;

    @BeforeEach
    void setUp() {
        leafSimilarTree = new LeafSimilarTree();
    }

    @AfterEach
    void tearDown() {
        leafSimilarTree = null;
    }

    @Test
    void leafSimilar() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(5);

        boolean leafSimilar = leafSimilarTree.leafSimilar(root, root2);
        Assertions.assertFalse(leafSimilar);
    }
}