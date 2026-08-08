package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PathSumIIITest {

    private PathSumIII pathSumIII;

    @BeforeEach
    void setUp() {
        pathSumIII = new PathSumIII();
    }

    @AfterEach
    void tearDown() {
        pathSumIII = null;
    }

    @Test
    void pathSum() {
        /*
        Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
        Output: 3
         */
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);
        int  result = pathSumIII.pathSum(root, 15);
        Assertions.assertEquals(2, result);

    }

    @Test
    void pathSum_largeValuesDoNotOverflow() {
        TreeNode root = new TreeNode(1_000_000_000);
        root.left = new TreeNode(1_000_000_000);
        root.left.left = new TreeNode(294_967_296);
        root.left.left.left = new TreeNode(1_000_000_000);
        root.left.left.left.left = new TreeNode(1_000_000_000);
        root.left.left.left.left.left = new TreeNode(1_000_000_000);

        int result = pathSumIII.pathSum(root, 0);
        Assertions.assertEquals(0, result);
    }
}