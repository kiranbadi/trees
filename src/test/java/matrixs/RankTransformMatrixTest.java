package matrixs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RankTransformMatrixTest {

    private RankTransformMatrix rankTransformMatrix;

    @BeforeEach
    void setUp() {
        rankTransformMatrix = new RankTransformMatrix();
    }

    @AfterEach
    void tearDown() {
        rankTransformMatrix = null;
    }

    @Test
    void matrixRankTransform() {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = rankTransformMatrix.matrixRankTransform(matrix);
        Assertions.assertEquals(expected, actual);

    }
}