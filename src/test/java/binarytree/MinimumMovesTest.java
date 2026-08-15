package binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumMovesTest {

    private MinimumMoves minimumMoves;

    @BeforeEach
    void setUp() {
        minimumMoves = new MinimumMoves();
    }

    @AfterEach
    void tearDown() {
        minimumMoves = null;
    }

    @Test
    void jumpCells() {
       int [][] maze = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        int k = 2;
        Assertions.assertEquals(4, minimumMoves.jumpCells(maze, k));
    }
}