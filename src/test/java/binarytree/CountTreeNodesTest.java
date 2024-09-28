package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTreeNodesTest {

    private CountTreeNodes countTreeNodes;

    @BeforeEach
    void setUp() {
        countTreeNodes = new CountTreeNodes();
    }

    @AfterEach
    void tearDown() {
        countTreeNodes = null;
    }

    @Test
    void countNodes() {
        assertEquals(0, countTreeNodes.countNodes(null));

        TreeNode root = new TreeNode(1);
        assertEquals(1, countTreeNodes.countNodes(root));

        root.left = new TreeNode(2);
        assertEquals(2, countTreeNodes.countNodes(root));

        root.right = new TreeNode(3);
        assertEquals(3, countTreeNodes.countNodes(root));

        root.left.left = new TreeNode(4);
        assertEquals(4, countTreeNodes.countNodes(root));

        root.left.right = new TreeNode(5);
        assertEquals(5, countTreeNodes.countNodes(root));

        root.right.left = new TreeNode(6);
        assertEquals(6, countTreeNodes.countNodes(root));

        root.right.right = new TreeNode(7);
        assertEquals(7, countTreeNodes.countNodes(root));
    }
}