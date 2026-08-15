package matrixs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeITest {

    private MazeI mazeI;

    @BeforeEach
    void setUp() {
        mazeI = new MazeI();
    }

    @AfterEach
    void tearDown() {
       mazeI = null;

    }

    @Test
    void hasPath() {
        int[][] maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};
        int[] start = {0, 0};
        int[] end = {3, 3};
        boolean expected = false;
       boolean actual = mazeI.hasPath(maze, start, end);
        Assertions.assertEquals(expected, actual);
    }
}