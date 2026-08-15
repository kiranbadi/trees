package graphs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EscapeLargeMazeTest {

    private EscapeLargeMaze escapeLargeMaze;

    @BeforeEach
    void setUp() {
        escapeLargeMaze = new EscapeLargeMaze();
    }

    @AfterEach
    void tearDown() {
        escapeLargeMaze = null;
    }

    @Test
    void isEscapePossible_whenSourceIsBlockedByWalls_returnsFalse() {
        int[][] blocked = {{0, 1}, {1, 0}};
        int[] source = {0, 0};
        int[] target = {0, 2};

        boolean actual = escapeLargeMaze.isEscapePossible(blocked, source, target);

        assertEquals(false, actual);
    }

    @Test
    void isEscapePossible_whenNoBlockedCells_returnsTrue() {
        int[][] blocked = {};
        int[] source = {0, 0};
        int[] target = {999_999, 999_999};

        boolean actual = escapeLargeMaze.isEscapePossible(blocked, source, target);

        assertEquals(true, actual);
    }

    @Test
    void isEscapePossible_whenTargetIsEnclosed_returnsFalse() {
        int[][] blocked = {{2, 3}, {3, 2}, {3, 4}, {4, 3}};
        int[] source = {0, 0};
        int[] target = {3, 3};

        boolean actual = escapeLargeMaze.isEscapePossible(blocked, source, target);

        assertEquals(false, actual);
    }
}

