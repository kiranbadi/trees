package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesTest {

    private CountGoodNodes countGoodNodes;

    @BeforeEach
    void setUp() {
        countGoodNodes = new CountGoodNodes();
    }

    @AfterEach
    void tearDown() {
        countGoodNodes = null;
    }

    @Test
    void goodNodes() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int result = countGoodNodes.goodNodes(root);
        Assertions.assertEquals(7, result);
    }
}