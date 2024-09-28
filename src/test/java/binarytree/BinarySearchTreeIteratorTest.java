package binarytree;

import objects.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeIteratorTest {

    private  BinarySearchTreeIterator binarySearchTreeIterator;

    @BeforeEach
    void setUp() {
        binarySearchTreeIterator = new BinarySearchTreeIterator(new TreeNode(2));
    }

    @AfterEach
    void tearDown() {
        binarySearchTreeIterator = null;
    }

    @Test
    void next() {
        Assertions.assertEquals(2, binarySearchTreeIterator.next());
    }

    @Test
    void hasNext() {
        Assertions.assertTrue(binarySearchTreeIterator.hasNext());
    }
}