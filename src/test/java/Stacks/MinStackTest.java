package Stacks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    private MinStack minStack;

    @BeforeEach
    void setUp() {
        minStack = new MinStack();
    }

    @AfterEach
    void tearDown() {
        minStack = null;
    }

    @Test
    void push() {
        minStack.push(5);
        minStack.push(10);
        minStack.push(3);
    }

    @Test
    void pop() {
        minStack.pop();
        Assertions.assertEquals(-1, minStack.top());
    }

    @Test
    void top() {
        minStack.push(5);
        minStack.push(10);
        Assertions.assertEquals(10, minStack.top());
    }

    @Test
    void getMin() {
        minStack.push(5);
        minStack.push(10);
        minStack.push(3);
        Assertions.assertEquals(3, minStack.getMin());
    }
}