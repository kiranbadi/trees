package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumNumbersTest {

    private SumNumbers sumNumbers;

    @BeforeEach
    void setUp() {
        sumNumbers = new SumNumbers();
    }

    @AfterEach
    void tearDown() {
        sumNumbers = null;
    }

    @Test
    void sumNumbers() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(25, sumNumbers.sumNumbers(root));

        root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        assertEquals(1026, sumNumbers.sumNumbers(root));
    }
}