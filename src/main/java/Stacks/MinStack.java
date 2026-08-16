package Stacks;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

    MinStack() initializes the stack object.
    void push(int value) pushes the element value onto the stack.
    void pop() removes the element on the top of the stack.
    int top() gets the top element of the stack.
    int getMin() retrieves the minimum element in the stack.

You must implement a solution with O(1) time complexity for each function.



Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2



Constraints:

    -231 <= val <= 231 - 1
    Methods pop, top and getMin operations will always be called on non-empty stacks.
    At most 3 * 104 calls will be made to push, pop, top, and getMin.

 */

import java.util.Stack;

public class MinStack {

    private final Stack<Integer> values;
    private final Stack<Integer> minStack;

    public MinStack() {
        values = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        values.push(value);

        // Keep minStack aligned by index: each entry stores the minimum up to that depth.
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            minStack.push(Math.min(value, minStack.peek()));
        }
    }

    public void pop() {
        if (!values.isEmpty()) {
            values.pop();
            minStack.pop();
        }

    }

    public int top() {

        if (!values.isEmpty()) {
            return values.peek();
        }
        return -1; // or throw an exception

    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1; // or throw an exception
    }
}
