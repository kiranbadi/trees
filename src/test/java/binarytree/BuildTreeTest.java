package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildTreeTest {

    private BuildTree buildTree;

    @BeforeEach
    void setUp() {
        buildTree = new BuildTree();
    }

    @AfterEach
    void tearDown() {
        buildTree = null;
    }

    @Test
    void buildTree() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = buildTree.buildTree(preorder, inorder);
        Assertions.assertEquals(3, root.val);
    }
}