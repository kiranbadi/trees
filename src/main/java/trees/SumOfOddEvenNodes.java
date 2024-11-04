package trees;

/*
https://www.geeksforgeeks.org/difference-between-sums-of-odd-level-and-even-level-nodes-in-an-n-ary-tree/
Given an N-ary Tree rooted at 1, the task is to find the difference between the sum of nodes at the odd level and the sum of nodes at even level.
Approach: To solve the problem, the idea is to find the respective sums of the nodes at the even and odd levels using Level Order Traversal and calculate the difference between them. Follow the steps below to solve the problem:

    Initialize a Queue to store nodes and their respective levels.
    Initialize variables evenSum and oddSum to store the sum of nodes at the even and odd levels respectively.
    Push the root of the N-ary Tree along with its corresponding level, i.e., 1, into the Queue.
    Now, iterate and repeat the following steps until the Queue becomes empty:
        Pop the nodes from the Queue. Store the level of the popped node in a variable, say currentLevel.
        If currentLevel is even, add the value of the node to evenSum. Otherwise, add to oddSum.
        Push all its children to the Queue and set their respective levels as currentLevel + 1.
    Once the above steps are completed, calculate and print the difference between oddSum and evenSum.
    Below is the implementation of the above approach:

 */

import objects.Node;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfOddEvenNodes {

    public  int getDifference(Node root) {
        if (root == null) {
            return 0;
        }
        int evenSum = 0;
        int oddSum = 0;
        int currentLevel = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if(current == null) {
                    continue;
                }
                if (currentLevel % 2 == 0) {
                    evenSum += current.data;
                } else {
                    oddSum += current.data;
                }
                queue.addAll(current.children);
            }
            currentLevel++;
        }
        return oddSum - evenSum;
    }


}
