package trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintLeadNodesTest {

    private PrintLeadNodes printLeadNodes;

    @BeforeEach
    void setUp() {
        printLeadNodes = new PrintLeadNodes();
    }

    @AfterEach
    void tearDown() {
        printLeadNodes = null;
    }

    @Test
    void printLeafNodes() {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}, {2, 7}};
        printLeadNodes.printLeafNodes(edges);
    }
}