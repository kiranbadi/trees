package trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightOfNArrayTreeTest {

    private HeightOfNArrayTree heightOfNArrayTree;

    @BeforeEach
    void setUp() {
        heightOfNArrayTree = new HeightOfNArrayTree();
    }

    @AfterEach
    void tearDown() {
        heightOfNArrayTree = null;
    }

    @Test
    void height() {
        int[] parent = {-1, 0, 0, 1, 1, 3, 5};
        assertEquals(5, heightOfNArrayTree.height(parent));
    }
}