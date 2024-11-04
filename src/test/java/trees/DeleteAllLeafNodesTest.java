package trees;

import objects.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteAllLeafNodesTest {

    private DeleteAllLeafNodes deleteAllLeafNodes;

    @BeforeEach
    void setUp() {
        deleteAllLeafNodes = new DeleteAllLeafNodes();
    }

    @AfterEach
    void tearDown() {
        deleteAllLeafNodes = null;
    }

    @Test
    void deleteLeafNodes() {
        Node root = new Node(1);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        Assertions.assertEquals(1, deleteAllLeafNodes.deleteLeafNodes(root).data);
    }
}