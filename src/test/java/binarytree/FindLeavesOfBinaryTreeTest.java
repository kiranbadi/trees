package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindLeavesOfBinaryTreeTest {

    private FindLeavesOfBinaryTree findLeavesOfBinaryTree;

    @BeforeEach
    void setUp() {
        findLeavesOfBinaryTree = new FindLeavesOfBinaryTree();
    }

    @AfterEach
    void tearDown() {
        findLeavesOfBinaryTree = null;
    }

    @Test
    void findLeaves() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        List<List<Integer>> expected1 = List.of(List.of(4, 5, 3), List.of(2), List.of(1));
        Assertions.assertEquals(expected1, findLeavesOfBinaryTree.findLeaves(root1));

        // Test case 2
        TreeNode root2 = new TreeNode(1);
        List<List<Integer>> expected2 = List.of(List.of(1));
        Assertions.assertEquals(expected2, findLeavesOfBinaryTree.findLeaves(root2));
    }
}