package graphs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeNumberOfPathsTest {

    private MazeNumberOfPaths mazeNumberOfPaths;

    @BeforeEach
    void setUp() {
        mazeNumberOfPaths = new MazeNumberOfPaths();
    }

    @AfterEach
    void tearDown() {
        mazeNumberOfPaths = null;
    }

    @Test
    void numberOfPaths() {
        int n = 4;
        int[][] corridors = {{1, 2}, {2, 3}, {3, 1}, {3, 4}};
        int expected = 1; // There is one cycle of length 3: 1 -> 2 -> 3 -> 1
        int actual = mazeNumberOfPaths.numberOfPaths(n, corridors);
        Assertions.assertEquals(expected, actual);
    }
}