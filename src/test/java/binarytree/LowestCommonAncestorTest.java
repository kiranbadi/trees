package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorTest {

    private LowestCommonAncestor lca ;

    @BeforeEach
    void setUp() {
        lca = new LowestCommonAncestor();
    }

    @AfterEach
    void tearDown() {
        lca = null;
    }

    @Test
    void findLCA() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode expected = root;
        TreeNode actual = lca.findLCA(root, p, q);
        assertEquals(expected, actual);

        p = root.left;
        q = root.left.right.right;
        expected = root.left;
        actual = lca.findLCA(root, p, q);
        assertEquals(expected, actual);

        p = root.left.right.left;
        q = root.left.right.right;
        expected = root.left.right;
        actual = lca.findLCA(root, p, q);
        assertEquals(expected, actual);
    }
}