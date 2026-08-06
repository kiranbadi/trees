package maps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollisionTest {

    private AsteroidCollision asteroidCollision;

    @BeforeEach
    void setUp() {
        asteroidCollision = new AsteroidCollision();
    }

    @AfterEach
    void tearDown() {
        asteroidCollision = null;
    }

    @Test
    void asteroidCollision() {
        int[] asteroids = {5, 10, -5};
        int[] expected = {5, 10};
        int[] actual = asteroidCollision.asteroidCollision(asteroids);
        Assertions.assertArrayEquals(expected, actual);
    }
}