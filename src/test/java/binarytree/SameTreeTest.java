package binarytree;

import org.junit.jupiter.api.Assertions;
import objects.TreeNode;

public class SameTreeTest {

    private SameTree sameTree ;

    public void setUp() throws Exception {
        sameTree = new SameTree();
    }

    public void tearDown() {
        sameTree = null;
    }

    public void testIsSameTree() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assertions.assertTrue(sameTree.isSameTree(p, q));
    }
}