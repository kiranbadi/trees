package trees;

import objects.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNodesEvenParityTest {

    private CountNodesEvenParity countNodesEvenParity;

    @BeforeEach
    void setUp() {
        countNodesEvenParity = new CountNodesEvenParity();
    }

    @AfterEach
    void tearDown() {
        countNodesEvenParity = null;
    }

    @Test
    void countEvenParity() {

        Node root = new Node(1);
        Node node1 = new Node(2);
        node1.children.add(new Node(3));
        node1.children.add(new Node(4));
        root.children.add(node1);
        Assertions.assertEquals(1, countNodesEvenParity.countEvenParity(root));
    }
}