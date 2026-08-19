package domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignMemoryAllocatorTest {

    private DesignMemoryAllocator allocator;

    private final int [] initialMemory = new int[10];

    @BeforeEach
    void setUp() {
        allocator = new DesignMemoryAllocator(10);
    }

    @AfterEach
    void tearDown() {
        allocator = null;
    }

    @Test
    void allocate() {
        allocator.allocate(5, 1);
        allocator.allocate(3, 2);
        allocator.allocate(2, 3);
    }

    @Test
    void freeMemory() {
        allocator.allocate(5, 1);
        allocator.allocate(3, 2);
        allocator.allocate(2, 3);
        allocator.freeMemory(2);
    }
}