package binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import objects.TreeNode;

public class SymmetryTreeTest {

    private SymmetryTree symmetryTree;

    @BeforeEach
    public void setUp() throws Exception {
        symmetryTree = new SymmetryTree();
    }

    @AfterEach
    public void tearDown()  {
        symmetryTree = null;
    }

    @Test
    public void testIsSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        assert symmetryTree.isSymmetric(root);
        Assertions.assertTrue(symmetryTree.isSymmetric(root));
    }

    @Test
    public void testIsMirror() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(3);
        t1.left.right = new TreeNode(4);
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(2);
        t2.left.left = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.left = new TreeNode(4);
        t2.right.right = new TreeNode(3);
        assert symmetryTree.isMirror(t1, t2);
        Assertions.assertTrue(symmetryTree.isMirror(t2, t1));
    }
}