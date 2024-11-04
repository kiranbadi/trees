package trees;

import objects.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintGeneralLevelTreeTest {

    private PrintGeneralLevelTree printGeneralLevelTree;

    @BeforeEach
    void setUp() {
        printGeneralLevelTree = new PrintGeneralLevelTree();
    }

    @AfterEach
    void tearDown() {
        printGeneralLevelTree = null;
    }

    @Test
    void printLevelOrder() {
        Node root = new Node(1);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));
        root.children.get(1).children.add(new Node(7));
        root.children.get(2).children.add(new Node(8));
        root.children.get(2).children.add(new Node(9));
        root.children.get(2).children.add(new Node(10));
        root.children.get(2).children.add(new Node(11));
        root.children.get(2).children.add(new Node(12));
        root.children.get(2).children.add(new Node(13));
        root.children.get(2).children.add(new Node(14));
        root.children.get(2).children.add(new Node(15));
        root.children.get(2).children.add(new Node(16));
        root.children.get(2).children.add(new Node(17));
        root.children.get(2).children.add(new Node(18));
        root.children.get(2).children.add(new Node(19));
        root.children.get(2).children.add(new Node(20));
        root.children.get(2).children.add(new Node(21));
        root.children.get(2).children.add(new Node(22));
        root.children.get(2).children.add(new Node(23));
        root.children.get(2).children.add(new Node(24));
        root.children.get(2).children.add(new Node(25));
        printGeneralLevelTree.printLevelOrder(root);

    }
}