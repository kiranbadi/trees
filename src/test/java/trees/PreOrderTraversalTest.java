package trees;

import objects.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreOrderTraversalTest {

    private PreOrderTraversal preOrderTraversal;

    @BeforeEach
    void setUp() {
        preOrderTraversal = new PreOrderTraversal();
    }

    @AfterEach
    void tearDown() {
        preOrderTraversal = null;
    }

    @Test
    void printPreOrderTraversal() {
        Node root = new Node(1);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));
        root.children.get(2).children.add(new Node(7));
        root.children.get(2).children.add(new Node(8));
        root.children.get(2).children.add(new Node(9));
        preOrderTraversal.printPreOrderTraversal(root);
    }
}