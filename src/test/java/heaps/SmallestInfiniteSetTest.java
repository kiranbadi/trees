package heaps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestInfiniteSetTest {

    private SmallestInfiniteSet smallestInfiniteSet;

    @BeforeEach
    void setUp() {
        smallestInfiniteSet = new SmallestInfiniteSet();
        for (int i = 1; i <= 1000; i++) {
            smallestInfiniteSet.addBack(i);
        }
    }

    @AfterEach
    void tearDown() {
        smallestInfiniteSet = null;
    }

    @Test
    void popSmallest() {
        int smallest = smallestInfiniteSet.popSmallest();
        assertEquals(1, smallest);
    }

    @Test
    void addBack() {
        smallestInfiniteSet.addBack(1);
        assertEquals(1, smallestInfiniteSet.popSmallest());
    }
}