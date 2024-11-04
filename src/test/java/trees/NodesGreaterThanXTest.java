package trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import objects.Node;

class NodesGreaterThanXTest {

    private NodesGreaterThanX nodesGreaterThanX;

    @BeforeEach
    void setUp() {
        nodesGreaterThanX = new NodesGreaterThanX();
    }

    @AfterEach
    void tearDown() {
        nodesGreaterThanX = null;
    }

    @Test
    void countNodesGreaterThanX() {
        Node root = new Node(1);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));
        root.children.get(2).children.add(new Node(7));
        root.children.get(2).children.add(new Node(8));
        root.children.get(2).children.add(new Node(9));
        assertEquals(5, nodesGreaterThanX.countNodesGreaterThanX(root, 3));
    }
}