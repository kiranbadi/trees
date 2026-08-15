package graphs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeIITest {

    private MazeII mazeII;

    @BeforeEach
    void setUp() {
        mazeII = new MazeII();
    }

    @AfterEach
    void tearDown() {
        mazeII = null;
    }

    @Test
    void shortestDistance() {
        int[][] maze = {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
        int[] start = {0, 4};
        int[] destination = {4, 4};
        int expected = 12;
        int actual = mazeII.shortestDistance(maze, start, destination);
        assertEquals(expected, actual);
    }
}