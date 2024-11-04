package trees;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcyclicListTest {

    private AcyclicList acyclicList;

    @BeforeEach
    void setUp() {
        acyclicList = new AcyclicList();
    }

    @AfterEach
    void tearDown() {
        acyclicList = null;
    }

    @Test
    void dfs() {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}};
        int[] visited = new int[7];
        acyclicList.dfs(0, visited, edges);
    }
}