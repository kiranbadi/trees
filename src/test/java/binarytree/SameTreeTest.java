package binarytree;

import junit.framework.TestCase;
import objects.TreeNode;

public class SameTreeTest extends TestCase {

    private SameTree sameTree ;

    public void setUp() throws Exception {
        super.setUp();
        sameTree = new SameTree();
    }

    public void tearDown() {
        sameTree = null;
    }

    public void testIsSameTree() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(sameTree.isSameTree(p, q));
    }
}