package matrixs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsCyclesTest {

    private ContainsCycles containsCycles;

    @BeforeEach
    void setUp() {
        containsCycles = new ContainsCycles();
    }

    @AfterEach
    void tearDown() {
        containsCycles = null;
    }

    @Test
    void containsCycle() {
        char[][] grid1 = {
                {'a', 'a', 'a', 'a'},
                {'a', 'b', 'b', 'a'},
                {'a', 'b', 'b', 'a'},
                {'a', 'a', 'a', 'a'}
        };
        Assertions.assertTrue(containsCycles.containsCycle(grid1));

        char[][] grid2 = {
                {'c', 'c', 'c'},
                {'c', 'd', 'c'},
                {'c', 'c', 'c'}
        };
        Assertions.assertTrue(containsCycles.containsCycle(grid2));

        char[][] grid3 = {
                {'e', 'f'},
                {'g', 'h'}
        };
        Assertions.assertTrue(containsCycles.containsCycle(grid3));
    }
}